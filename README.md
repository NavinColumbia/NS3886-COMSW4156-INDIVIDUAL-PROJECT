# COMS W4156 Advanced Software Engineering

### Mini Project 2024

### Name: Navinashok Swaminathan
### UserName: NavinColumbia
### UNI: ns3886
### email: ns3886@columbia.edu
##### Link: https://github.com/NavinColumbia/NS3886-COMSW4156-INDIVIDUAL-PROJECT
##### Assignment 1 Link: https://github.com/NavinColumbia/4156-Miniproject-2024-Students-Java.git
##### branch: main
##### Demo: 
Click on the thumbnail below [![thumbnail_gcp_demo](https://dl.dropbox.com/scl/fi/th8dnst3q7a87kize4o7s/thumbnail_2.png?rlkey=pr7k4ayvxemkzwc3tcvrmjm4y&st=mdfmn1wk&dl=0)](https://www.dropbox.com/scl/fi/ndnuyz13imok2ncaak33f/ns3886-GCP-Demo.mp4?rlkey=k868b1bosoadsuw2vapey8myy&st=kdv2mjlz&dl=0)
<br />
or visit https://www.dropbox.com/scl/fi/ndnuyz13imok2ncaak33f/ns3886-GCP-Demo.mp4?rlkey=k868b1bosoadsuw2vapey8myy&st=kdv2mjlz&dl=0


## Note About HyperLinks:
Links to videos/images in this ReadMe , are from dropbox. <br />
'www' urls are purely for view/download purposes. <br />
Replace 'www' with 'dl' in the event that an expected file format is required for any sort of processing<br />
Say for example to import json for postman directly using the URL : <br />
&emsp;Use https://dl.dropbox.com/scl/fi/qeonw7222mvijuhdk3zyl/Postman_tests_ns3886.postman_collection.json?rlkey=0ji1msxuwpqjcy3iuxvis4q2f&st=6iclsah3&dl=0 <br />
&emsp;Instead of https://www.dropbox.com/scl/fi/qeonw7222mvijuhdk3zyl/Postman_tests_ns3886.postman_collection.json?rlkey=0ji1msxuwpqjcy3iuxvis4q2f&st=6iclsah3&dl=0 <br />



# Building and Running a Local Instance

### Install java( preferred: 17/21):
https://www.oracle.com/java/technologies/downloads/#java21

### Install Brew:
Package Manager for Mac <br />
Refer https://brew.sh/ or do:  
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD install.sh)" .
```

### Install maven:
For Mac:
`brew install maven`

### Git Clone Repo :
```
git clone https://github.com/NavinColumbia/NS3886-COMSW4156-INDIVIDUAL-PROJECT.git
```

### Set-Up:
if data.txt does not exist in IndividualProject: <br />
&emsp; ensure port 8080 is unoccupied
```
cd IndividualProject
mvn spring-boot:run -Dspring-boot.run.arguments="setup"
```
Wait till "System Setup" shows up
Cancel above/any applications running in port 8080 (press control+c).<br />
Now data.txt must exist in IndividualProject

### Build:
```
cd IndividualProject
mvn clean verify
```

### Running The Application:
```
cd IndividualProject 
mvn spring-boot:run
```
Wait till "Start up" shows up
Application must now be Running In: http://localhost:8080/






# Style Checking

Run checkstyle:
```
cd IndividualProject
mvn checkstyle:check
```
Check console output for errors/warnings/violations.
![current checkstyle reports 0 violation](https://dl.dropbox.com/scl/fi/5gcr3vfpt7xrgzqpknyp8/checkstyle.png?rlkey=dh4y87fqu9vd8th72r16cewet&st=la8otewt&dl=0)

# Code Documentation
Generate Javadocs
```
cd IndividualProject
mvn javadoc:javadoc
```
Open in browser ./IndividualProject/target/site/apidocs/index.html
![javadoc generated successfully](https://dl.dropbox.com/scl/fi/iafacjcyrrtpa3ub71wvh/javadoc.png?rlkey=a72r7ogn63fbui2m1xcwa7da4&st=ubd4jiui&dl=0)
# Static Code Analysis
PMD(mentioned in assignment) was the static analyzer used.
&nbsp;

&emsp;Installing and running PMD:
&nbsp;

&emsp;&emsp; Install pmd:
``` 
brew install pmd
```
&emsp;&emsp;Run PMD:
```
    cd IndividualProject
    pmd check -d src/main/java -R rulesets/java/quickstart.xml -f text -r "pmdres.txt"
    pmd check -d src/main/java -R rulesets/java/quickstart.xml -f html -r "pmdres.html"
```
&emsp;&emsp;Find file named pmdres.html inside folder 'IndividualProject'.<br />
&emsp;&emsp;Open the html with any browser or check 'pmdres.txt'.<br />
&emsp;&emsp;An empty content in either of the file mean no further suggestions.
![0 pmd violations](https://dl.dropbox.com/scl/fi/utdukkbj5u7ywxf1estht/pmd.png?rlkey=nfhcita2utj1ljfnchmxl66p0&st=0cn4qb4g&dl=0)

# Running Tests and Jacoco Report
As part of `mvn clean verify` , tests under ./IndividualProject/src/test/java must have been executed.

&nbsp;

### Test Reports
From the previously run `mvn clean verify`, find '.txt' files under 'IndividualProject/target/surefire-reports/' to view test results <br/>
Or you can run mvn clean test and view console output <br />
![All tests ran successfully](https://dl.dropbox.com/scl/fi/3edd1mr4axj33al47mvjx/tests.png?rlkey=ucqo7kama387f0dzzihrklxm1&st=9sj7fo6m&dl=0)
&nbsp;

### Jacoco Report
From the previously run `mvn clean verify` <br />
&emsp;&emsp;Find file 'index.html' under 'IndividualProject/target/site/jacoco/' and<br />
Open with any browser to view jacoco results
![jacoco report shows >90% coverage](https://dl.dropbox.com/scl/fi/v84lsix7x2dcwfpn3tyb8/jacoco.png?rlkey=gicmg9d1c2h428hm4tlqc11ia&st=8jeshnt6&dl=0)



# Google Cloud Deployment
### Setup Billing For Your Account:
&emsp;&emsp;visit https://console.cloud.google.com/billing, <br />
&emsp;&emsp;Login with google sign-in and enter your payment details
&nbsp;

### Create a new Project in Google Cloud Console:
&emsp;&emsp;visit https://console.cloud.google.com/projectselector2
&emsp;&emsp; and create a project (note your project id)
&nbsp;

### Install Google Cloud sdk :
```
brew install --cask google-cloud-sdk
```
&nbsp;

### Login and basic setup:
&emsp;&emsp;Follow The steps after entering below in terminal
```
gcloud init
```
&nbsp;

### Update pom.xml:
&emsp;&emsp;Under &lt;appengine-maven-plugin&gt; set your project_id in pom to match the one in google cloud.

### Set app.yaml
&emsp;&emsp;Update app.yaml under ./IndividualProjects.Set entry point to target jar, and preferred java version.

### Deploy
```
cd IndividualProject
gcloud config set project ${{PROJECT_ID}}
gcloud app deploy
gcloud app browse
 ```
&nbsp;

### GCP Demo :
&emsp;&emsp; Click on the thumbnail below:
&emsp;&emsp;[![thumbnail_gcp_demo](https://dl.dropbox.com/scl/fi/th8dnst3q7a87kize4o7s/thumbnail_2.png?rlkey=pr7k4ayvxemkzwc3tcvrmjm4y&st=96f1j01m&dl=0)](https://www.dropbox.com/scl/fi/ndnuyz13imok2ncaak33f/ns3886-GCP-Demo.mp4?rlkey=k868b1bosoadsuw2vapey8myy&st=kdv2mjlz&dl=0) <br /> 
&emsp;  &emsp; or visit :<br />
&emsp;&emsp; https://www.dropbox.com/scl/fi/ndnuyz13imok2ncaak33f/ns3886-GCP-Demo.mp4?rlkey=k868b1bosoadsuw2vapey8myy&st=kdv2mjlz&dl=0

# Testing EndPoint With Postman
&emsp; 1.Install Postman  (https://www.postman.com/)
&nbsp;

&emsp; 2.Download the following JSON:    
&emsp;  &emsp; [click here to download](https://www.dropbox.com/scl/fi/qeonw7222mvijuhdk3zyl/Postman_tests_ns3886.postman_collection.json?rlkey=0ji1msxuwpqjcy3iuxvis4q2f&st=x1b8bvoj&dl=0)        
&emsp;  &emsp; or visit <br/>
&emsp;&emsp; https://www.dropbox.com/scl/fi/qeonw7222mvijuhdk3zyl/Postman_tests_ns3886.postman_collection.json?rlkey=0ji1msxuwpqjcy3iuxvis4q2f&st=x1b8bvoj&dl=0
&nbsp;

&emsp; 3.Go to 'my workspace' in Postman, click 'import', and select the downloaded json.<br/>
&nbsp;

&emsp; &emsp;Please Note that I might have removed my project from <br />
&emsp; &emsp;https://ns3886-adv-swe-individual-prj.uk.r.appspot.com/ <br />
&emsp; &emsp;at the time you are reading this.<br/>

&emsp; &emsp;So please host your own copy and and update the URL in the postman tests accordingly.</br>
&emsp; &emsp;Alternatively, you can run the instance locally , and test it via postman.
On import, tests should be available as follows:
![postman_ss](https://dl.dropbox.com/scl/fi/cw99dgetunltokmqm4vs9/postman.png?rlkey=bayfkdrthrqu3oa1r6acb4s99&st=ulae5haf&dl=0)

# Continuous Intergration
&emsp;&emsp; Workflows can be found under .github/workflows/github-actions.yml. <br />
&emsp;&emsp; The workflow triggers on push events, and pulls to main branch. <br />
&emsp;&emsp; The build is failed in case of pmd/style check violation. <br />
&emsp;&emsp; Test coverage badge is generated for each run. <br />
&emsp;&emsp; Go to Actions-> All workflows and click on the most recent workflow. click build for further details. <br />
sample ss of a workflow:
![sample image](https://dl.dropbox.com/scl/fi/56s6xn52voz6qh7waae4g/ci.png?rlkey=75qgpu1syixk51kjowqj5qzoc&st=8jfb8gfe&dl=0)

# Honesty
Please find honesty.txt at the root of the directory

# Citations
Please find citations.txt at the root of the directory


# Old ReadMe(Assignment 1,2):

    Individual Assignment 2: Feature Implementation and Maintenance 
         
        Pre-Requisite:
            Please Follow Basic Instructions under 'Individual Assignment 1: Testing and Bug Fixing'  
            in README.md for setup and review
         
        0)Reminder of Required Documentation:
                a. honesty.txt and citations.txt can be found at root level of the repo

        1) Feature A Implementation:
            /retrieveCourses endpoint has been created.
                a. RouteController.java has the relevant method implementation
                b. RouteControllerTest.java has the relevant test for the same
                c. PostMan Testing Screenshot attached in pull request for the GET method

        2) Feature B Implementation:
            /enrollStudentInCourse endpoint has been created. 
                a. RouteController.java has the relevant method implementation
                b. RouteControllerTest.java has the relevant test for the same
                c.PostMan Testing Screenshot attached in pull request for the PATCH method


        3. Maintaining the Codebase:
            a. bugs.txt under "Further Robustness Improvements" discusses robustness enhancements.
            b. new tests have been written for the code changes
            c. style check have been done

        4.Submission:
            Submission Details:
                Assignment 2:
                Name: Navinashok Swaminathan
                UserName: NavinColumbia
                UNI: ns3886
                email: ns3886@columbia.edu
                branch: main
                Link: https://github.com/NavinColumbia/NS3886-COMSW4156-INDIVIDUAL-PROJECT
                Pull Request Has ScreenShots


                
                
                
            
    Individual Assignment 1: Testing and Bug Fixing 

        0)Set-up:
                if data.txt doesn't exist in IndividualProject:
                        ensure port 8080 is unoccupied
                        cd IndividualProject
                        mvn spring-boot:run -Dspring-boot.run.arguments="setup"
                wait till "System Setup" shows up
                cancel above/any applications running in port 8080 (press control+c)
                now data.txt must exist in IndividualProject


        1)Code Clean Up
                a. Run checkstyle:
                        cd IndividualProject
                        mvn checkstyle:check
                        check console output for errors/warnings/violations.
                b. Generate javadoc:
                        cd IndividualProject
                        mvn javadoc:javadoc
                        open in browser IndividualProject/target/site/apidocs/index.html


        2)Test Suite Creation
                a. Tests can be found under IndividualProject/src/test/java
                b. Executing tests:
                        cancel running application from step 0.
                        Ensure port 8080 isn't occupied. 
                        cd IndividualProject
                        mvn clean validate compile test package       
                c. Test Reports : find '.txt' files under 'IndividualProject/target/surefire-reports/' to view test results
                d. Jacoco Report : find file 'index.html' under 'IndividualProject/target/site/jacoco/' and open with any browser to view jacoco results


        3)Bug Fixing
                a. The identified bugs, and the fixes made are documented under 'bugs.txt' at the root directory
                b. PMD(mentioned in assignment) was the static analyzer used. Installing and running PMD:
                        1.Install brew (Package Manager for Mac): Refer https://brew.sh/
                        or do: 
                                /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD install.sh)" . 
                        2.Install pmd:
                                brew install pmd 
                        3.Run PMD: 
                                cd IndividualProject
                                pmd check -d src/main/java -R rulesets/java/quickstart.xml -f text -r "pmdres.txt" 
                                pmd check -d src/main/java -R rulesets/java/quickstart.xml -f html -r "pmdres.html"
                        4.Find file named pmdres.html inside folder 'IndividualProject' ,open the html with any browse. or check 'pmdres.txt'
                          An empty content in either of the file mean no further suggestions.
                c. Run the application and test using Postman:
                        cd IndividualProject
                        cancel any applications running in port 8080
                        mvn spring-boot:run 
                        wait till "Start up" shows up
                        Test the application using Postman (https://www.postman.com/)
                        say, set URL to http://localhost:8080/retrieveCourse?deptCode=IEOR&courseCode=2500
                        select relevant method "GET" in this case, click Send and notice the result.


        4. Academic Honesty Pledge
                a. "honesty.txt" containing my pledge can be found at the root directory of this project


        5. Submission
                a. "citations.txt" file in project root contains the links and descriptions of all the resources used during this assignment
                b. Submission :
                        Name: Navinashok Swaminathan
                        UserName: NavinColumbia
                        UNI: ns3886
                        email: ns3886@columbia.edu
                        branch: main 
                        Link: https://github.com/NavinColumbia/4156-Miniproject-2024-Students-Java.git







