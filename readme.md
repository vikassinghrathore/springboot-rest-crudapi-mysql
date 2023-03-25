## Test Spring Boot CRUD REST APIs using Postman Client
### Create User REST API:

http://localhost:8080/api/users
![img.png](img.png)

### Get All Users REST API:
http://localhost:8080/api/users
![img_1.png](img_1.png)

### Get Single User REST API:
http://localhost:8080/api/users/1
![img_2.png](img_2.png)

### Update User REST API:
(OR)
User existingUser = userRepository.findById(user.getId()).get();
existingUser.setFirstName(user.getFirstName());
existingUser.setLastName(user.getLastName());
existingUser.setEmail(user.getEmail());
User updatedUser = userRepository.save(existingUser);
return updatedUser;

http://localhost:8080/api/users/4
![img_3.png](img_3.png)
