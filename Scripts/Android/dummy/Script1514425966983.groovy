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

Mobile.startApplication('/Users/arnandadw/Downloads/sc_dev_2017-12-22.apk', true)

Mobile.switchToPortrait()

not_run: WebUI.acceptAlert()

Mobile.tap(findTestObject('Sweatcircle/android.view.View9'), 0)

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText0 - Email (1)'), 'tiara@skyshi.io', 0)

Mobile.setText(findTestObject('Sweatcircle/android.widget.EditText1 (1)'), '54321', 0)

not_run: Mobile.tap(findTestObject('Sweatcircle/android.widget.TextView3 - LOGIN'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View7'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('SC-Activity/android.view.View9'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View11'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View43'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View5'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View80'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View80 (1)'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View47'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View6'), 0)

Mobile.switchToPortrait()

Mobile.setText(findTestObject('SC-Activity/android.widget.EditText0 - Activity Title'), 'Badminton rabu', 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View51'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View52'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('SC-Activity/android.widget.LinearLayout3'), 0)

Mobile.tap(findTestObject('SC-Activity/android.widget.Button1 - SELECT'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('SC-Activity/android.view.View54'), 0)

Mobile.tap(findTestObject('SC-Activity/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View55'), 0)

Mobile.tap(findTestObject('SC-Activity/android.widget.Button1 - OK (1)'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View56'), 0)

Mobile.tap(findTestObject('SC-Activity/android.widget.Button1 - OK (1)'), 0)

Mobile.tap(findTestObject('SC-Activity/android.view.View71'), 0)

Mobile.switchToPortrait()

not_run: Mobile.closeApplication()

