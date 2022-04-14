import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PROJECT WEB/DemoBlaze/Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/contact/Page_STORE/a_Contact'))

WebUI.setText(findTestObject('Object Repository/contact/Page_STORE/input_Contact Email_recipient-email'), 'akaza@gmail.com')

WebUI.setText(findTestObject('Object Repository/contact/Page_STORE/input_Contact Name_recipient-name'), 'akaza bin salman')

WebUI.setText(findTestObject('Object Repository/contact/Page_STORE/textarea_Message_message-text'), 'i love the product')

WebUI.click(findTestObject('contact/Page_STORE/Page_STORE/button_Close'))

WebUI.callTestCase(findTestCase('PROJECT WEB/DemoBlaze/Common/Log out'), [:], FailureHandling.STOP_ON_FAILURE)
