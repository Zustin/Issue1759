# Result

* build script: spot.sh
* Source code: MiniCase.java

Directly run the shell script *spot.sh* with paramenter "MiniCase".

```bash
./spot.sh MiniCase
```

Then, the testing result file is **Result_MiniCase.html**.

## Problem

Actually, Spotbugs should report a waring at line 8 about the rule [BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY](https://spotbugs.readthedocs.io/en/latest/bugDescriptions.html#bc-impossible-downcast-of-toarray-result-bc-impossible-downcast-of-toarray).

## Environment
* Java: Oracle 1.8
* SpotBugs: 4.4.2
