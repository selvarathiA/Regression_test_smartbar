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

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.setText(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_Welcome to SmartBar/input_useremail'), 
    'admin')

WebUI.setText(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_Welcome to SmartBar/input_userpassword'), 
    'password')

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_Welcome to SmartBar/span_Login'))

WebUI.delay(25)

WebUI.setText(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/input_form-control input-sm in'), 
    'g1')

WebUI.delay(25)

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/i_fa fa-edit'))

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/input_type'))

WebUI.setText(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/input_form-control input-sm in'), 
    'south')

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/button_Update Group'))

WebUI.click(findTestObject('security matrix/Page_SmartBar  Admin Dashboard/Group_updation/Page_SmartBar  Admin Dashboard/div_Group Updated succesfully'))

WebUI.delay(25)

WebUI.closeBrowser()

