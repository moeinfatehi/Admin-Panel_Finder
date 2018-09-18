# AdminPanelFinder
 A burp suite extension that enumerates infrastructure and application Admin Interfaces (OWASP OTG-CONFIG-005)

# Why should I use this extension?
* Multi thread
* Different and configurable levels of test.
* Includable status codes
* Excludable status codes
* More than 1000 buit-in payloads.
* You can load your own dictionary.
* Editable root directory
* automatic detection of used technologies to generate custom payloads.
* Passive listening to find login pages.


Here is a screenshot of extension's results.</br></br>
<img src="https://cdn1.imggmi.com/uploads/2018/9/18/c4b1b813889f0efd845ad656eef2efca-full.png">

# Quick Start
1. Select a request of a target host from any tab of burp suite
2. In "Admin Panel Finder -> options" tab, apply your configurations.
3. Go to "Admin Panel Finder -> Finder -> Finder" tab and click on "start" button.


# Some of the options
These options can be used to customize the detection:
* Level: Level of tests to perform (1-5, default 3)
* Thread: num of threads (1-50, default 10)
* Built-in dictionary: there is a built-in dictionary containing most used directory and file names to be used for static payload generation.
* Loadable dictionary: you can use your own dictionary file for static payload generation.
* HTTP method: HTTP method to be used in requests (HEAD, GET)(default: Head)
* Extension: The extension used in application pages. [Example: php, asp, aspx, jsp, ...] 
* Root Dir: The path to the Root directory of web application. (Default: /)
* Includable status codes
* Excludable status codes

# Disclaimer
This program is for Educational purpose ONLY. Do not use it without permission. The usual disclaimer applies, especially the fact that I'm not liable for any damages caused by the direct or indirect use of the information or functionality provided by these programs. The author or any Internet provider bears NO responsibility for content or misuse of these programs or any derivatives thereof. By using these programs you accept the fact that any damage (data loss, system crash, system compromise, etc.) caused by the use of this program is not my responsibility.

# Contact
If you have any further questions, please don't hesitate to contact me via my <a href="https://twitter.com/MoeinFatehi">twitter</a> account.
