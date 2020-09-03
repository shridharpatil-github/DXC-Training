## Project: CRICINFO.COM
### Project Description

A web application which provides information of Cricket Matches.

### Technologies

```
* Front End
	* HTML 5, CSS 3, Bootstrap 4.
	* Angular 8.
* Back End
	* Java 1.8.
	* Mongodb,MySql.
```

### Features

* Displays New Matches, Upcoming Matches, Old Matches.
* User can add matches to his favorites list.
* User can recommend new matches, it will be recommended for other users.


### Flow Chart

![Flow Chart of Module](/flowchart.png)

### Modules and Functionalities
```
Angular Modules:

  Project
	|
	├── Home                		    // to display home page
	├── Register                                // to display register user page 
	├── Login               	            // to display login page 
	├── Old matches                             // page to display old matches information  
	├── New matches                             // page to display new matches information  
	├── Upcoming matches                 	    // page to display upcoming matches information  
	├── Recommended,favorite 		    // page to display recommeded,favorite matches
	├── Service			            // service for authentication user and send,retrieve,delete data to back end
    	├── Model			            // model class for user and new match
    	├── profile               		    // page to update user profile information
	└── header,footer 		            // component for header,footer

Backend Modules:

 Cricket Project
	|
	├── controller             		    // rest controller for interaction with angular
	├── model                                   // model class for new match
	├── repository               	            // mongo repository for db operations 
	├── service                         	    // to perform crud operations in db
	├── response                                // defined response for better use 
	├── exception                 	 	    // exception classes 
	├── filter				    // jwt filter for checking token from client
	├── aspectj
 User Authentication Project
	|
	├── controller             		    // rest controller for interaction with angular
	├── model                                   // model class for new match
	├── repository               	            // jpa repository for db operations 
	├── service                         	    // to perform crud operations in db
	├── response                                // defined response for better use 
	├── exception                 	 	    // exception classes 
	├── tokengenerator,bcrypt // jwt token generator from server,bcrpyt to encrypt password to storein db
	├── aspectj	
```
	
### Steps For Run Application

1. clone the project
2. cricket -> folder is front-end, angular technology and open it in VS code/open it command prompt
	1. run command-> `ng serve`
3. cricketmatch-user-authentication-> is a backend, spring-boot technology and open it in eclipse/sts 		IDE, it is gives service for perform the user authentication and user account creation.
	1. Once update the project
	2. change mysql password and write database name in application.properties
	3. run as spring-boot App
3. cricketproject -> is a backend, spring-boot technology and open it in eclipse/sts IDE, it is gives 		service for perform the recommend, unrecommend and all new macthes operations.
	1. Once update the project
	2. write database name in application.properties
	3. run as spring-boot App