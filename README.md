> **_NOTE:_** Check our new ReactNative Demo App with VGS Collect and VGS Show SDKs [here](https://github.com/vgs-samples/vgs-collect-show-react-native-demo).




# VGS Collect/Show SDK. React Native Demo.

<p align="center">
    <img src="images/vgs-filled.png" width="200">
    <img src="images/vgs-revealed.png" width="200">
</p>

> **_NOTE:_**  This demo is just an example of how VGS Collect SDK and VGS Show SDK can be integrated into your application.


## How to run it?


### Step 1

Go to your <a href="https://dashboard.verygoodsecurity.com/" target="_blank">VGS organization</a> and establish <a href="https://www.verygoodsecurity.com/docs/getting-started/quick-integration#securing-inbound-connection" target="_blank">Inbound connection</a>. For this demo you can import pre-built route configuration:

<p align="center">
<img src="images/dashboard_routs.png" width="600">
</p>

- Find the **configuration.yaml** file inside the app repository and download it.
- Go to the **Routes** section on the <a href="https://dashboard.verygoodsecurity.com/" target="_blank">Dashboard</a> page and select the **Inbound** tab.
- Press **Manage** button at the right corner and select **Import YAML file**.
- Choose **configuration.yaml** file that you just downloaded and tap on **Save** button to save the route.


### Step 2

`git clone git@github.com:vgs-samples/vgs-collect-show-android-react-native-demo.git`


### Step 3


> **_NOTE:_** Please visit React Native <a href="https://reactnative.dev/docs/environment-setup" target="_blank">documentation</a>
> for more detailed explanation how to setup environment.</br>


**Specify Android SDK directory**

Create `local.properties` file in `~/vgs-collect-show-android-react-native-demo/android` folder and specify `sdk.dir` property.

```
## This file must *NOT* be checked into Version Control Systems,
# as it contains information specific to your local configuration.
#
# Location of the SDK. This is only used by Gradle.
# For customization when using a Version Control System, please read the
# header note.
sdk.dir=<ANDROID_SDK_DIRECTORY_PATH>
```

### Step 4

Setup `"<VAULT_ID>"`.

**VGS Collect SDK**. Find [VGSCollectModule.java](https://github.com/vgs-samples/vgs-collect-show-android-react-native-demo/blob/master/android/app/src/main/java/com/verygoodsecurity.reactnative/collect/VGSCollectModule.java#L31) and replace `VAULT_ID` constant with your <a href="https://www.verygoodsecurity.com/docs/terminology/nomenclature#vault" target="_blank">vault id</a>.

**VGS Show SDK**. Find [VGSShowModule.java](https://github.com/vgs-samples/vgs-collect-show-android-react-native-demo/blob/master/android/app/src/main/java/com/verygoodsecurity.reactnative/show/VGSShowModule.java#L29) and replace `VAULT_ID` constant with your <a href="https://www.verygoodsecurity.com/docs/terminology/nomenclature#vault" target="_blank">vault id</a>.


### Step 5


> **_NOTE:_** Please visit React Native <a href="https://reactnative.dev/docs/running-on-device" target="_blank">documentation</a>
> to read how to run the application on a device.</br>

#### Running the project with script

This step is not mandatory but helpful.

You could use script to make integration process faster. The script helps to avoid some popular issues and run application on a device.

- Open a Terminal and go to the project directory.
- If this is first start - run ``npm install`` command.
- Run `npx react-native run-android`


### Step 6

Submit and reveal the form then go to the Logs tab on a Dashboard, find a request and secure a payload.
Instruction for this step you can find <a href="https://www.verygoodsecurity.com/docs/getting-started/quick-integration#securing-inbound-connection" target="_blank">here</a>.




