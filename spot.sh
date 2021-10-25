JavacPath=PATH/TO/JAVAC
${JavacPath} -d . $1.java
./SpotBugs/bin/spotbugs -textui -effort:max -html -output ./result_$1.html $1.class