# freshers-training-assignment
Assignment given at the end of the training session for freshers at Tiket
Rayhan Asadel (BE Engineer Intern)

# Setup
You need to have all of this installed to run this application:
1. MySQL
2. Java
3. MongoDB
4. Intellij IDE

create a database with name "movie_hall", and then go to src/main/resources/application.properties
and change the configuration below based on your settings

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/movie_hall 

spring.datasource.username=root //Insert your database username    

spring.datasource.password=Password1 //inser your database password   

# Running the app
you can start the web server by running it from intellij IDE

after that there will be some dummy data already created like below:  
Movie_Hall Table:  
[
{
"hall_id": 1,
"hall_name": "Hall-A",
"capacity": 50,
"booked": false
},  
{
"hall_id": 2,
"hall_name": "Hall-B",
"capacity": 75,
"booked": false
},  
{
"hall_id": 3,
"hall_name": "Hall-C",
"capacity": 150,
"booked": false
}
]

Book_Schedule Table:  
[
{
"book_id": 1,
"hall_id": 1,
"book_time": "2022-06-15"
},  
{
"book_id": 2,
"hall_id": 2,
"book_time": "2022-06-10"
},  
{
"book_id": 3,
"hall_id": 3,
"book_time": "2022-06-05"
}
]

# API and Operation You Can Do
and after the server initiated there will be some operation that you can do with the data created via these API:

GetMovieHalls: http://localhost:8080/api/movie-hall

AddMovieHalls: http://localhost:8080/api/movie-hall   
with request body:   
{
"hall_name": "Hall-D",  
"capacity": 200,  
"booked": false
}

DeleteMovieHalls: http://localhost:8080/api/movie-hall/{hall_id}

GetBookSchedule: http://localhost:8080/api/book-schedule

AddBookSchedule: http://localhost:8080/api/book-schedule   
with request body:   
{
"hall_id": 1,  
"book_time": "2022-06-15"  
}

DeleteBookSchedule: http://localhost:8080/api/book-schedule/{book_id}   


