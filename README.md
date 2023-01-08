# WSExercise
This is a gorup exercise repository for the “PassingScoreAPI” exercise. <p>Group members are:</p> Heping Song, Hua Zhang, Yateng Geng and Chester rae de vera.

<p>
In this project, we are having 3 java files on total and 1 pom file for dependencies.<br />
The Main class will be the program entrance to run the whole programe, containing the main method.<br />
In the ScoreManager class is the execute method, which is containing the main lagic progress. We invoke this mehod in the main method to return true / false if the score received is equal or greater than 6.<br />
The TestScore class is for the Junit test, we using hard code to set up a string array which contains only 1 element. We put this element as 4 to return true as we expected in the Assert method. So that this will be a pass test, and there is a "Test pass" message will print out.<br />
In the pom file you will find the groupId and version control settings, there is also junit dependency and addClassPath plugin as well.
</p>
When users runing this application in command line, should following the score they want to check.<br/>
For example:
java -jar PassingScoreAPI-1.0-SNAPSHOT.jar 9
