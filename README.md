# Issue 1759

## Environment
* Javac Version: javac 1.8.0_171
* SpotBugs Version: 4.4.2
* Build script: spot.sh
* Source code: MiniCase.java
* SpotBugs Folder: SpotBugs/

## Run

1. Set Javac path in spot.sh (line1)
2. Directly run the shell script *spot.sh* with paramenter "MiniCase".
```bash
./spot.sh MiniCase
```
3. Then, the testing result file is **Result_MiniCase.html**.

## Problem

Actually, Spotbugs should report a waring at line 8 about the rule [BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY](https://spotbugs.readthedocs.io/en/latest/bugDescriptions.html#bc-impossible-downcast-of-toarray-result-bc-impossible-downcast-of-toarray).
