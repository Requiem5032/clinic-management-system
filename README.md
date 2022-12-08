<h1>
  <div align="center">
    <b>CLINIC MANAGEMENT SYSTEM</b>
  </div>
</h1>

<p align="center">
  <img src="signature.jpg" alt="Signature"/>
</p>

## ***Member list:***

- 17035 Nguyen Hoang Hai Nam
- 17273 Truong Hoang Nam
- 17306 Tran Minh Ngoc
- 18810 Tran Kim Hoan

***Lecturer:*** Dr. Tran Hong Ngoc

## ***Part 1: System Requirement***

- Install visual studio code with java jdk and code runner extension, mysql, git command to clone the project (you can use another text editors or IDE likes Eclipse, NetBeans but in this instruction we will demonstrate using VSCode)
- You should use the latest version

## ***Part 2: Installation Step***

- Step 1: Create new folder, open this new folder in vscode, open terminal and write this statement to clone the project

```lang-non
  git clone <https://github.com/Requiem5032/java-project>
```

- Step 2: Open My SQL, click the plus sign to create new connection

<figure>
  <center>
    <img src="Tutorials/Figure 1.png" alt="Figure 1"/>
    <figcaption>Figure 1</figcaption>
  </center>
</figure>

- Step 3: Type the name of the connection then click ok, after that click on the connection that you just create and type password

<figure>
  <center>
    <img src="Tutorials/Figure 2.png" alt="Figure 2"/>
    <figcaption>Figure 2</figcaption><br/>
    <img src="Tutorials/Figure 3.png" alt="Figure 3"/>
    <figcaption>Figure 3</figcaption>
  </center>
</figure>

- Step 4: In connection window, click on query and type this statement, then click on lighting icon to execute

```lang-non
  SET GLOBAL local_infile = 'ON';
```

<figure>
  <center>
    <img src="Tutorials/Figure 4.png" alt="Figure 4"/>
    <figcaption>Figure 4</figcaption><br/>
    <img src="Tutorials/Figure 5.png" alt="Figure 5"/>
    <figcaption>Figure 5</figcaption>
  </center>
</figure>

- Step 5: Go back to main back, left-click on the connection and then click on edit connection
- Step 6: Click on advanced and then in the others box, you add this statement. After that you click the close button

```lang-non
  OPT_LOCAL_INFILE=1
```

<figure>
  <center>
    <img src="Tutorials/Figure 6.png" alt="Figure 6"/>
    <figcaption>Figure 6</figcaption><br/>
    <img src="Tutorials/Figure 7.png" alt="Figure 7"/>
    <figcaption>Figure 7</figcaption><br/>
    <img src="Tutorials/Figure 8.png" alt="Figure 8"/>
    <figcaption>Figure 8</figcaption>
  </center>
</figure>

- Step 7: Go back to vscode, in the clone folder, open the file name “clinic_db.sql”
- Step 8: Change this directory in this line to your computer directory, then save

<figure>
  <center>
    <img src="Tutorials/Figure 9.png" alt="Figure 9"/>
    <figcaption>Figure 9</figcaption>
  </center>
</figure>

> *Note: You can use file explore in window 10,11 to find your directory, this “ \ “ and this “/” are diffrent*

- Step 9: Go to folder src/clinic/connect, open the “DBconnection” file, change the port, connection name, connection password to your, then save

<figure>
  <center>
    <img src="Tutorials/Figure 10.png" alt="Figure 10"/>
    <figcaption>Figure 10</figcaption>
  </center>
</figure>

- Step 10: In the file explore, click on java projects, scroll down and click on referenced libaries

<figure>
  <center>
    <img src="Tutorials/Figure 11.png" alt="Figure 11"/>
    <figcaption>Figure 11</figcaption><br/>
    <img src="Tutorials/Figure 12.png" alt="Figure 12"/>
    <figcaption>Figure 12</figcaption>
  </center>
</figure>

- Step 11: In referenced libaries, click on plus sign button, then add the “mysql-connector-j-8.0.31.rar” (the file name may be diffrent depend on the version), click the button “select jar libaries”

<figure>
  <center>
    <img src="Tutorials/Figure 13.png" alt="Figure 13"/>
    <figcaption>Figure 13</figcaption>
  </center>
</figure>

> *Note: You can find this file on folder Connect J 80 (or similar name) on your computer MySQL propram files*

- Step 11: Go back My SQL, click on database connections you have created before to open connection window
- Step 12: Open SQL script, click on file name “clinic_db.sql” on your clone folder to open, click on lighting button to run and then click the reload button on schema table . If the system have error, try to drop schema and run again.

<figure>
  <center>
    <img src="Tutorials/Figure 14.png" alt="Figure 14"/>
    <figcaption>Figure 14</figcaption>
  </center>
</figure>

- Step 13: Finally you run Demo.java and the homepage will appear

<figure>
  <center>
    <img src="Tutorials/Figure 15.png" alt="Figure 15"/>
    <figcaption>Figure 15</figcaption>
  </center>
</figure>
