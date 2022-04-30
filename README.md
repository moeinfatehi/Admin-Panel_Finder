# Admin Panel Finder
 A burp suite extension that enumerates infrastructure and application Admin Interfaces. </br></br>
<b>OWASP References:</b>
* <b>Classification</b>: Web Application Security Testing > 02-Configuration and Deployment Management Testing
* <b>OTG v4</b>: OWASP OTG-CONFIG-005
* <b>WSTG</b>: <a href="https://owasp.org/www-project-web-security-testing-guide/v42/4-Web_Application_Security_Testing/02-Configuration_and_Deployment_Management_Testing/05-Enumerate_Infrastructure_and_Application_Admin_Interfaces">WSTG-CONF-05</a></br></br>

# Why should I use this extension?
* Multi-thread
* Different and configurable levels of test.
* Includable status codes
* Excludable status codes
* More than 1000 built-in payloads.
* You can load your dictionary.
* Editable root directory
* Automatic detection of used technologies to generate custom payloads.
* Passive listening to find login pages.

# Installation
The quickest way is to load the jar file (adminPanelFinder.jar) in the extender tab of the Burpsuite.</br>
Extender -> Extensions -> Add</br>
A new tab will be added to the burp suite.</br>

# Quick Start
1. Select a request of a target host from any tab of the burp suite (it must have a response with any status code)
2. In the "Admin Panel Finder -> options" tab, apply your configurations.
3. Go to the "Admin Panel Finder -> Finder -> Finder" tab and click on the "start" button.


# Some of the options
These options can be used to customize the detection:
* Level: Level of tests to perform (1-5, default 3)
* Thread: num of threads (1-50, default 10)
* Built-in dictionary: there is a built-in dictionary containing the most used directory and file names to be used for static payload generation.
* Loadable dictionary: you can use your dictionary file for static payload generation.
* HTTP method: HTTP method to be used in requests (HEAD, GET)(default: Head)
* Extension: The extension used in application pages. [Example: php, asp, aspx, jsp, ...] 
* Root Dir: The path to the root directory of the web application. (Default: /)
* Includable status codes
* Excludable status codes

# Disclaimer
This program is for educational purpose ONLY. Do not use it without permission. The usual disclaimer applies, especially the fact that I'm not liable for any damages caused by the direct or indirect use of the information or functionality provided by these programs. The author or any Internet provider bears NO responsibility for content or misuse of these programs or any derivatives thereof. By using these programs you accept the fact that any damage (data loss, system crash, system compromise, etc.) caused by the use of this program is not my responsibility.

# Contact
If you have any further questions, please don't hesitate to contact me via my <a href="https://twitter.com/MoeinFatehi">twitter</a> account.
