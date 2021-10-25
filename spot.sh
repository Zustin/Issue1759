echo $1
./java-8-oracle/bin/javac -d . $1.java
./SpotBugs/bin/spotbugs -textui -effort:max -html -output ./result_$1.html $1.class