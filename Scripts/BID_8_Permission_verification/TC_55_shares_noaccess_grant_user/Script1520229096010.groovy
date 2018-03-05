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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta1.beerboard.com/')

WebUI.click(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.setText(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar/input_useremail'), 'qwerty')

WebUI.setText(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar/button_Login'))

WebUI.delay(30)

WebUI.verifyElementNotPresent(findTestObject('BID_8_Permission_verification/user/Page_SmartBar  Retailer Dashboard/div_Categories  Styles      by'), 
    10)

WebUI.closeBrowser()

