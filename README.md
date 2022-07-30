# Applying-the-Following-axes-method
Assignment 1 W8D5 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)


## Question
Write  3 or 4 examples for  XPath applying the Following axes method.


## Answer
I used itmeo website https://itmeo.com/
Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I Opened the website, then write four Xpath using 'Following' axes method.

- XPath= //a[text()='new releases']/following::a[text()='all templates']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181951069-cdec3ec3-c7ea-4a57-991c-7f79ac074ee0.png" width=60% height=60%>
</p>

- XPath= //button[@class='search-form__btn']/following::input[@class='search-form__input']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181959237-5e9f4ddc-e5ef-4385-b056-e1ceb8bcb885.png" width=60% height=60%>
</p>

- XPath= //a[@href='/pricing']/following::a[@href='/login' and contains(text(),'Log In')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181960879-8d53b8e8-9ce7-433b-aa56-7350ba27c2e2.png" width=60% height=60%>
</p>

- XPath= //a[@href='/pricing']/following::a[@href='/login' and contains(text(),'Log In')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181961668-984fcfcb-8fd3-40ad-978c-beacf1e50a5c.png" width=60% height=60%>
</p>




## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181966622-95dd0284-8a66-4a1e-b697-8277066b1708.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/181966740-96762565-834c-4170-8968-d57e2464a5ad.mp4



</p>
