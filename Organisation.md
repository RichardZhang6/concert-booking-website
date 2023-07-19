# Summary of Team contribution and discussion
Team member:  
Name: Richard Zhang UPI: yzhb266 Github identifier: @RichardZhang6   
Name:Lareina Li UPI: lli885 GitHub identifier: @hotreina  
Name: Jamie Shin UPI: jshi136 Github identifier: @teulstls  
* We as a whole team had a meeting at the start of the project to discuss how to implement the domain models, dto mappers, DTO and concert resource.   
* As a Result
Richard decided to work on the domain model,I started working on the implementation of Booking, Seat and User domain classes. I finished working on the implementation and also added the DTO annotations that are necessary. I also later added the implemetation of bookings in the concert-resource class. When I had problems and questions with how to implement certain methods, my teammates always assisted and discussed with me what are need to be implemented. I was also tasked with the write-up of the organsationmd, the work contribution of each member and the strategies to avoid concurrency and other write-ups needed in the organisation file. I also added code documentation to make the code more readable.  
* Our other team member Lareina proposed to write up the concert-resource class of the project. It was a big task, therefore we all participated in the discussion and logic behind the methods necessary. She wrote most of the implementation. But we all gave our help when there were failures in the integrations tests. She also completed the Annotation needed for the domain model classes. When she was working on concertesource class, she also found problem in the DTO annotations and domain model and managed to fix them. She also wrote up the code documentation of the concert-resource class. 
* Our other member Jamie wanted to complete the domain model Concert and performer  classes because they are related. He also completed all the mappers for DTO and domain models. We all participated in the discussion of the implementation when he is faced with problem as well. Later on he went on to complete the subscription methods of the concert-resource class he also implemented the method for the staus of the seat at the specific time. Other team members also discussed and help with the logic when there were errors from the integration tests.  
* Side note: We worked on the project together most of the time in person at university, therefore we did not do a lot of the communication on GitHub and issues. So just by looking at GitHub, there might not be lots of discussion. But we actually discussed quite a bit in person and have made changes together.  
* We discussed the coding for domain models, dto mappers, jpa annotation, concert resource and rest of the implementation and in majority mostly one person completed the implementation of each one because we understand otherwsie it would create conflict.  
  
## Strategies used to minimise the chance of concurrency errors in program execution  
* Inside the methods of the concertresource class, while we were creating query in entity manager, we used setlockmode method to avoid concurrency errors.  
*  The use of the pessimistic lock modes specifies that the persistence manager is to immediately have long-term read or write locks for the database data corresponding to the entity state. Therefore this avoids concurrency problems.  

## Short description of how the domain model is organised  
* we created concert and performer class relation in the domain model. We mapped it to the entity by using the @joined table annotation. We constructed the manytomany realtion between these two tables also using the manytomany annotation.  
* We also used the fetchtype.lazy to improve the performence. It avoids unnecessary fetching of the data.  
* We also used the cascadetype.persisit to save the associated entity during the operation of creating relationship of one to many or many to many betweeen tables.  
* We also created a new booking domain model class, it has the related attribute necessary for the booking service of the resource class. It also saves seat, concertID and user information.  
* All the attributes in the related DTO are saved in the domain model class.  
  
## We used The issues for inital team discussion  
## Clarification   
We created a branch called final at the end to check if all the end implmentation would be right, we did not use our old working brannch beacuse we know it is going to create conflict, since we all changed the same file it is going to create conflict when we merge branch. Instead, We just have the final branch and move all the final version of the file here to test if it works. We also commited to these file as accurately as possible to the actual work contribution of each team memeber. SO that is why there would be a large amountof commits to the final branch in a short amount of time. Finally, we would merge this with the main branch.  

