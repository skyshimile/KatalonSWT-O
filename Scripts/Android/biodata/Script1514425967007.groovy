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

Mobile.startApplication('/Users/arnandadw/Downloads/sc_dev_2017-12-14.apk', true)

Mobile.switchToPortrait()

WebUI.waitForPageLoad(0)

Mobile.tap(findTestObject('Sweatcircle/android.view.ViewGroup30'), 0)

Mobile.tap(findTestObject('Sweatcircle/android.view.ViewGroup17'), 0)

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText0 - Hometown'), 'Yogya', 0)

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText1 - Bio'), 'Halo aku emile', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText2 - emileskyshi.io'), 'emile@skyshi.io', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText3 - a'), 'emile', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText4 - g'), 'Francois', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText5 - 81393121317'), '81393121317', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sweatcircle/android.view.ViewGroup57'), 0)

Mobile.closeApplication()

