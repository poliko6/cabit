## Quick tutorial ##

**Generate release key for android app google maps api**

**Demonstration for the Cabit-Android app**

1. click on the Cabit-Android folder

2. File -> export... -> Android -> Export Android Application

3. Choose the Cabit-Android Project

4. Choose "create new keytore"

(this is for the first time, afterwards choose "Use existing keystore")

5. Choose dest to create to keystore file (i.e. c:\CabitKeyStore) with file name such as: "androidDeploy1" + ".keystore"

6. Fill in the password field

7. leave the alias as it is, fill some of the info that's required (i.e. same password, 100, Organization = Cabit)

8. Choose dest for the apk file (file name + ".apk")

9. open command line, cd to your java library -> /bin

10.execute:
**keytool -list -V -alias cabit -keystore "C:\CabitKeyStore\androidDeploy1.keystore"**

11. Find the MD5 fingerprint

12. Open https://developers.google.com/android/maps-api-signup

13. insert the MD5 fingerprint and generate key related to that apk