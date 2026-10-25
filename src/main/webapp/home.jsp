<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>h2 jpa data</title>
</head>
<body>

<nav style="background-color: #f2f2f2; padding: 10px; margin-bottom: 20px;">
    <a href="/" style="margin-right: 15px;">Home</a>
    <a href="addAlien" style="margin-right: 15px;">Add Alien</a>
    <a href="getAlien" style="margin-right: 15px;">Search Alien</a>
</nav>
<hr>
   <!-- Form 1: Add Alien -->
   <div class="form-container">
       <h2>Add New Alien</h2>
       <form action="addAlien" method="post">
           <label>ID:</label>
           <input type="text" name="aid"><br>
           <label>Name:</label>
           <input type="text" name="aname"><br>
           <label>Tech:</label>
           <input type="text" name="tech"><br>
           <input type="submit" value="Add Alien">
       </form>
   </div>

   <!-- Form 2: Get Alien by ID -->
   <div class="form-container">
       <h2>Search Alien by ID</h2>
       <form action="getAlien" method="get">
           <label>Alien ID:</label>
           <input type="text" name="aid"><br>
           <input type="submit" value="Search">
       </form>
   </div>

      <!-- Form 3: Delete Alien by ID -->
           <div class="form-container">
               <h2>delete Alien by ID</h2>
               <form action="deleteAlien" method="delete">
                   <label>Alien ID:</label>
                   <input type="text" name="aid"><br>
                   <input type="submit" value="Search">
               </form>
           </div>

           <!-- Form 2: Get Alien by Tech -->
              <div class="form-container">
                  <h2>Search Alien by Tech</h2>
                  <form action="getAlienByTech" method="get">
                      <label>Alien ID:</label>
                      <input type="text" name="tech"><br>
                      <input type="submit" value="Search">
                  </form>
              </div>

           <!-- Form 2: Get Alien by Tech -->
                          <div class="form-container">
                              <h2>Search Alien by Greater than aid</h2>
                              <form action="getAlienGreaterAid" method="get">
                                  <label>Alien ID:</label>
                                  <input type="text" name="aid"><br>
                                  <input type="submit" value="Search">
                              </form>
                          </div>
                    <!-- Form 2: Get Alien by Tech Sorted-->
                          <div class="form-container">
                              <h2>Search Alien by Tech Sorted</h2>
                              <form action="getAlienTechSorted" method="get">
                                  <label>Alien ID:</label>
                                  <input type="text" name="tech"><br>
                                  <input type="submit" value="Search">
                              </form>
                          </div>

</body>
</html>