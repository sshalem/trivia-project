# trivia-project

create git clone in a local folder

1. first create a repository in GitHub
2. clone the url of the repository that created

3. on local desktop, go to the folder where you want to clone the repsoitory
4. Since I have git installed on my laptop, go to the folder , right click on the mouse and open GIT bash
5. this will show the git prompt with the path to the folder
6. type pwd to verify folder location in git bash

7. copy the files of project to the clone git folder
8. go to the clone folder by typing  cd:/"the created clone folder"  where the file of .git is present
9. use following commands in the following order:

  9.1. git status
  9.2. git add. - this will stage the file in the clone directory  (or git add --all see comment below)
  9.3. git status
  9.4. git commit -m "the message I want" 
  9.5. git push
  
 



here's a problem with the "git add ." command. 
Since we're currently working in the root directory, "git add ." will only add files located in the root directory.  
But the root directory may contain many other directories with files.  

Question: 
  How can we add files from those other directories plus the files in the root directory to the staging area?  
Answer: 
Git offers the command below: 

$ git add --all 
