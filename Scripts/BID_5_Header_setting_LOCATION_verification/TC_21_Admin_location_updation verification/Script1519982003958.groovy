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

WebUI.click(findTestObject('location_updation/Page_Welcome to SmartBar (1)/button_Dont Allow'))

WebUI.setText(findTestObject('TC_1_Login/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('location_updation/Page_Welcome to SmartBar (1)/input_userpassword'), 'password')

WebUI.click(findTestObject('location_updation/Page_Welcome to SmartBar (1)/span_Login'))

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/a_nav-link nav-toggle'))

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/a_Retailer Settings'))

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenSun'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenMon'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenTue'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenWed'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenThu'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenFri'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_preOpenSat'), '7.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openSun'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openMon'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openTue'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openWed'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openThu'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openFri'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_openSat'), '11.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeSun'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeMon'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeTue'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeWed'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeThu'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeFri'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (2)/input_closeSat'), '2.00')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_name'), '8')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_alertPoint'), '44')

WebUI.doubleClick(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_alertPoint'))

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/div_List of Coolers          P'))

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_offset'), '00')

WebUI.scrollToElement(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/label_Country'), 25)

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/textarea_description'), 'check')

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/fieldset_Detail'))

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/label_Street'))

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_addrStreet'), '96 Avenue C')

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/label_City'))

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_addrCity'), 'New York')

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/div_Street'))

WebUI.doubleClick(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_addrZip'))

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_addrZip'), '10009')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_addrCountry'), 'US')

WebUI.scrollToElement(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/a_Update'), 25)

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_facebook'), 'facebook.com')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_twitter'), 'twitter.com')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_instagram'), 'instagram.com')

WebUI.setText(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/input_pinterest'), 'pinterest.com')

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/a_Update'))

WebUI.click(findTestObject('location_updation/Page_SmartBar  Admin Dashboard (3)/div_Updated successfully.'))

WebUI.closeBrowser()

