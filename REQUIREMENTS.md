High St. Hospital
Objective
Students will employ good software design and testing principles in order to create a class hierarchy using OO principles (Abstraction, Polymorphism, Inheritance and Encapsulation).
Students will be able to define super, abstract, extends, implements, isA and instanceof
The Scenario
High St. Hospital is an organizational mess. They have unkempt files of employee information scattered throughout manilla folders, computer data files, and old tin filing cabinets. With the madness of the daily grind, patients are the priority. But the utmost care cannot be given to the patients if the hospital is disorganized. High St. Hospital wants to get it together. They have subcontracted We Can Code IT full-stack apprentices (who work for the relatively inexpensive price of free) to come in and organize. They enable you to set up shop with a few company laptops in an old dissheveled break room. Your mission is to create a set of classes that contain information on the employees at High St. Hospital:

High St. Hospital has the following model at its facility:

Employee
calculatePay() abstract method with no specifications
appropriate getter methods and toString()
Patient
default BLOOD_LEVEL of 20 (What does this naming convention suggest again???)
default HEALTH_LEVEL of 10
High St. Hospital has the following classifications at its facility

Doctor is a Hospital Employee and gets paid 90,000
Nurse is a Hospital Employee and gets paid 50,000
Surgeon is a Doctor and gets paid 120,000
Receptionist is a Hospital Employee and gets paid 45,000
Janitor is a Hospital Employee and gets paid 40,000
The Data
The following Instance Data will need to be taken care of for each employee

Employees have a name and ID number
Doctors have a name, ID number, and a specialty area (Heart, Brain, Foot, etc…).
Surgeons have a name, ID number, a specialty area, and whether they are operating or not.
Nurses have a name, ID number, a Collection of Patients.
Receptionists have a name, ID number, and whether they are on the phone or not.
Janitors have a name, ID number, and whether they are sweeping or not.
VampireJanitors have a name, ID number, whether they are sweeping or not.
Special Duties
Not all employees in the hospital have the same capabilities. Only certain staff members can implement certain medical duties such as drawBlood() or careForPatient()

Getting Started
Plan -> Prepare -> Program
First, start by mapping out relationships. See what Classes you will need and how they interact with each other. (Pen and paper)
Next, prepare a project using this guide. Set up a git repository for your project and a corresponding one on GitHub. If you are pairing, make sure your partner has access to the repo and the ability to push and pull. Make sure you are following best practices whether you are pairing or working alone. (Make sure to have a master branch, a dev branch, and give feature-branches a shot)
Start programming. Remember to start with specifics and work toward generality. Choose one type of employee to create, test drive that class. Once that one is finished, pick another and pull similarities up into a parent class or interface.
Example Output
Here are the employees at High St. Hospital
Doctor Phil    111 Brain
Surgeon Harry 222 Plastic true
Nurse Jackie 333 [list of patients]
Receptionist Janine 444    true
Janitor Rosie 555 true
VampireJanitor Vlad 666 false

Here are the pay rates at High St. Hospital
Phil gets paid a salary of 90000 per year.
Harry gets paid a salary of 120000 per year.
Jackie gets paid a salary of 50000 per year.
Janine gets paid a salary of 45000 per year.
Rosie gets paid a salary of 40000 per year.

Some Employees can draw blood
Phil is capable of drawing blood.
Harry is capable of drawing blood.
Jackie is capable of drawing blood.

Some Employees can administer patient care
Phil has increased patient health to 20
Harry has increased patient health to 20
Jackie has increased patient health to 15
As you look at this output to the console, the true/false attached to some of the employees simply represents the state they are in relative to if they are currently involved in their jobs or not.

Stretch Tasks
Give Stretch Tasks a shot ONLY after requirements have been met. Completion of stretch tasks won't give you any extra credit, but, if your attempt breaks a requirement, that will cost you points. I suggest using feature branches to implement Stretch Tasks after requirements are finished.

Stretch task: Tina is an EmergencyDispatcher. She is a trained medical professional and a first responder. She also has great people skills and can answer calls and manage what ambulance gets sent to a situation. She sometimes joins the crew and respondes to calls on the fly. Add her as an employee and give her the proper functionality. This job pays 45,000.
Stretch task: Search for an individual employee by name and access their info/what they are doing
Stretch task: add an employee, fire an employee
Rubric
Category	Max Score
Care for all Patients	10
Care for an individual Patient	10
Manage cleanliness of Hospital	10
Proper use of Abstract Classes and Interfaces	10
Proper tick() method to change state of Patients	10
Proper game loop	10
Encapsulate all instance variables	10
Proper Class structure for all entities	10
TDD	10
Clean Code	10
Total	100
