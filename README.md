# Motorious
Deployed with Heroku, visit here: https://center-motorious.herokuapp.com


Application in general:
- RestControllers and Controllers
- Over 10 services
- 6 independent entities
- 6 repositories
- OAuth2 - login with GitHub
- OAuth2 - login with Facebook (test/dev mode using)
- Cloudinary API for 
  * picture upload
  * delete picture
- Pagination
- models - binding, view, service
- Spring Security (prevent SQL injection, CSRF, parameter tampering, secure routes,secure password) 
- Custom Security annotation (on some is used SpEl)
- Custom route namespace
- Custom login,login with Github, logout
- Custom successHandler, depends on user roles
- Thymeleaf Security
- Thymeleaf
- Sending mail for information
- Custom filter
- AJAX
- Fetch Api 
- Async, await
- Dynamic content with JS, carousel with JS, 
- Scroller with percentage and gradient
- JavaScript validation when user enter input 
- Rest
- HTML/CSS
- JavaScript
- jQuery
- Spring Events
- Spring AOP
- Spring @Async 
- PreFilter & PostFilter
- DB programmability - @Procedure store in DB
- Limit session to only one
- Remember me
- Mapping library - Model mapper
- Data validation - frontend and backend
- Custom validators
- Using layers with multiple layouts 
- Testing - unit test and integration tests for some of the controllers using mocking - 80% coverage
- Exceptions handling and CustomAccessDeniedHandler
- Custom error pages
- Interceptors
- Spring Cache
- Spring Schedule tasks
- MySQL database
- Database quality control
- Jpa
- JPQL, native queries
- Jpa Specification Executor - find user by username
- Google API for data visualisation
- Google API for maps
- Media queries for responsive design

Application functionalities:
- 4 manageable roles - ROOT, ADMIN, KINESITHERAPIST, USER
- Picture upload if user want via Cloudinary API
- Login with GitHub
- Pagination of all users - AJAX with JPA.
- Send mail when blog is created, when user have new treatment or measurement.
- Search engine(find user by username or email) and generate dynamic content - AJAX with JPA filtration
- Search treatment by keyword - generate dynamic content with AJAX.
- Add global eventListener to delegate events.
- Add, delete users
- Registration form 
- Login form
- Custom login page, depends on user roles.
- Add, delete treatment
- Add, delete measurement
- Add, delete blog
- Confirm when delete blog, otherwise stop action
- View all users
- View all clients by kinesitherapist
- View all blogs
- Contact form
- Update user details
- View yours treatments
- View yours measurements
- Downgrade role of user 
- Change role of user
- Information page
- Measurement activity of action - Spring AOP
- Delete user or register user - Spring Events
- When user try to access unauthorised route, log the information in app
- Added address on the maps for navigation via Google API 
- Responsive design for smartphones, tablets, laptop, etc.
- JavaScript calendar 

To try the app, please enter environment variables on your IDE for 
- MySQL username and password
- Cloudinary credentials
- Mail credentials
