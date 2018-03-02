import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta1.beerboard.com/')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('createuser_in groupmanagement/Page_Welcome to SmartBar/span_Login'))

WebUI.delay(25)

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_form-control input-sm in'), 
    'G1')

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/a_G1'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/h1_G1 - User Management'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/a_Add new user'))

WebUI.delay(25)

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_username'), 'breweryadmin')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_password'), 'password')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_password_confirmation'), 
    'password')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_email'), 'testdolly2@gmail.com')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_first_name'), 'test')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_last_name'), 'dolly2')

WebUI.setText(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_mobile'), '856756754')

WebUI.scrollToElement(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/button_Add User'), 15)

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard (2)/input_ui-select-search input-x'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/div_St. Lawrence Brewing Compa'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/input_user_type'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/button_Add User'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/div_User added succesfully'))

WebUI.delay(25)

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/i_fa fa-angle-down'))

WebUI.click(findTestObject('createuser_in groupmanagement/Page_SmartBar  Admin Dashboard/a_Logout'))

WebUI.closeBrowser()

