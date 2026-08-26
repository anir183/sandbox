#!/usr/bin/env python3

# simple c23 runner / builder
#
# features:
# - recursively finds source files
# - builds into ./bin/
# - automatically links all ./lib/*.c files
# - uses clang + c23
# - enables warnings + sanitizers + debug info
# - cross-platform

import sys
import subprocess
from pathlib import Path

if len(sys.argv) < 2:
	print("usage: python run.py <file-name | path>")
	sys.exit(1)

query = sys.argv[1]

root = Path.cwd()

# resolve source file
src = None

candidate = Path(query)

if candidate.exists():
	src = candidate
else:
	for file in root.rglob("*"):
		if file.is_file():
			if file.name == query or file.name == f"{query}.c":
				src = file
				break

if src is None:
	print("error: source file not found")
	sys.exit(1)

# output path
bin_dir = root / "bin"
bin_dir.mkdir(exist_ok=True)

out = bin_dir / src.stem

# windows executable extension
if sys.platform == "win32":
	out = out.with_suffix(".exe")

# gather library sources
lib_sources = []

lib_dir = root / "lib"

if lib_dir.exists():
	lib_sources = [str(f) for f in lib_dir.rglob("*.c")]

# compiler flags
flags = [
	"-std=c23",

	"-Wall",
	"-Wextra",
	"-Wpedantic",
	"-Wshadow",
	"-Wconversion",
	"-Wdouble-promotion",
	"-Wformat=2",
	"-Wnull-dereference",
	"-Wimplicit-fallthrough",
	"-Wcast-align",
	"-Winvalid-pch",
	"-Wmissing-declarations",
	"-Wundef",
	"-Wfloat-equal",

	"-g3",
	"-O0",

	"-fsanitize=address,undefined",
	"-fno-omit-frame-pointer",

	"-I./"
]

# build command
cmd = [
	"clang",
	str(src),
	*lib_sources,
	*flags,
	"-o",
	str(out)
]

print()
print("building:")
print(f"  source : {src}")
print(f"  output : {out}")
print()

print(" ".join(cmd))
print()

# build
result = subprocess.run(cmd)

if result.returncode != 0:
	sys.exit(result.returncode)

print("build successful.")
print()

# run
_ = subprocess.run([str(out)])
