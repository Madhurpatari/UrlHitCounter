# URL Hit Counter Spring Boot Application

<p>This is a simple Spring Boot application that implements a URL hit counter feature. 
  It allows you to track the number of times a particular URL has been accessed by different users.</p>

## Endpoints
This application exposes the following endpoints:

* GET /api/v1/visitor-count-app/hit: Returns the total number of hits for all URLs.
* GET /api/v1/visitor-count-app/url/{url}/hit: Returns the number of hits for a specific URL.
* POST /api/v1/visitor-count-app/url/{url}/hit: Increments the hit count for a specific URL.
* GET /api/v1/visitor-count-app/username/{username}/count: Returns the number of hits for a specific user.


## Technologies Used
<p>This application was built using the following technologies:</p>

* Java 
* Spring Boot
* Maven

## Conclusion
<p>This URL hit counter application demonstrates a simple use case of Spring Boot and its ability to handle HTTP requests and responses.</p>

