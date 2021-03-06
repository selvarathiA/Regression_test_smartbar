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

WebUI.setText(findTestObject('verifylocation,customer,units/Page_Welcome to SmartBar/input_useremail'), 'qwerty')

WebUI.setText(findTestObject('verifylocation,customer,units/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('verifylocation,customer,units/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.click(findTestObject('verifylocation,customer,units/Page_Welcome to SmartBar/span_Login'))

WebUI.delay(20)

WebUI.click(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/i_fa fa-filter font-size-20'))

WebUI.delay(20)

WebUI.doubleClick(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/select_ABC Beer Co.'))

WebUI.selectOptionByValue(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/select_OuncesLitersKegs (1984o'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/select_OuncesLitersKegs (1984o'), 
    'number:11', true)

WebUI.selectOptionByValue(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/select_OuncesLitersKegs (1984o'), 
    'number:2', true)

WebUI.click(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/button_Clear'))

WebUI.click(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/a_remove'))

WebUI.delay(20)

WebUI.click(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/img_img-circle'))

WebUI.click(findTestObject('verifylocation,customer,units/Page_SmartBar  Retailer Dashboard/a_Logout'))

WebUI.closeBrowser()

