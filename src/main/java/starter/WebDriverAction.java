//package starter;
//
//public class WebDriverAction
//{
//    public  void  click () {
//
//        try {
//            log.info("Performing click action");
//            new WebDriverExpectedConditions().explicitWaitClick((PageObject) this).click();
//        } catch (Exception e) {
//            log.info("Exception",e);
//            RetryLogic.retryLogic((PageObject) this,"click",e);
//            //Verify.logFailMessage("========Error in click Action on Page object :"+((PageObject) this).toString()+"" , e);
//
//
//        }
//    }
//
//
//    public  void doubleClick () {
//
//        try {
//            log.info("Performing click action");
//            Actions action = new Actions(((PageObject) this).getWebDriver());
//
//            action.doubleClick(new WebDriverExpectedConditions().explicitWaitDisplay((PageObject) this)).build().perform();
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in doubleClick Action on Page object :"+((PageObject) this).toString()+"" , e);
//
//            RetryLogic.retryLogic((PageObject) this,"doubleClick",e);
//        }
//    }
//
//    /*public  void dragAndDrop() {
//
//        // action.dragAndDrop((WebElement) pageObject.getParameterValue(),(WebElement) pageObject.getParameters()[1]).build().perform();
//
//    }*/
//
//    public  void sendKeys() {
//        try {
//            log.info("Performing sendKeys action");
//            //System.out.println(Thread.currentThread().getId());
//            ((PageObject)this).getWebElement().clear();
//            new WebDriverExpectedConditions().explicitWaitDisplay((PageObject)this).sendKeys(((PageObject) this).parameterValue);
//
//        }
//        catch (Exception e)
//        {
//            //Verify.logFailMessage("========Error in sendKeys Action on Page object :"+((PageObject) this).toString()+"" , e);
//
//            // Verify.logFailMessage("========Error in sendKeys Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"sendKeys",e);
//        }
//    }
//
//
//    public  void sendKeys(String param) {
//        try {
//            log.info("Performing sendKeys action");
//            ((PageObject)this).getWebElement().clear();
//            new WebDriverExpectedConditions().explicitWaitDisplay((PageObject)this).sendKeys(param);
//
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in sendKeys Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"sendKeys",e);
//        }
//    }
//
//
//
//    public  void moveToElement() {
//        try {
//            log.info("Performing moveToElement action");
//            Actions action = new Actions(((PageObject)this).getWebDriver());
//            action.moveToElement(new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this))).build().perform();
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in moveToElement Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"moveToElement",e);
//        }
//    }
//
//
//    public  void contextClick() {
//        try {
//            log.info("Performing contextClick action");
//            Actions action = new Actions(((PageObject)this).getWebDriver());
//            action.contextClick(new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this))).build().perform();
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in contextClick Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"contextClick",e);
//        }
//    }
//
//
//    public  void clickAndHold() {
//        try {
//            log.info("Performing clickAndHold action");
//            Actions action = new Actions(((PageObject)this).getWebDriver());
//            action.clickAndHold(new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this))).build().perform();
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in clickAndHold Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"clickAndHold",e);
//        }
//    }
//
//
//    public  void release() {
//        try {
//            log.info("Performing release action");
//            Actions action = new Actions(((PageObject)this).getWebDriver());
//            action.release(new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this))).build().perform();
//        }
//        catch (Exception e)
//        {
//            //   Verify.logFailMessage("========Error in release Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"release",e);
//        }
//    }
//
//
//    public void  getwindowByTitleName() {
//        try {
//            log.info("Performing getwindowByTitleName action");
//            String currentWindow = ((PageObject)this).getWebDriver().getWindowHandle();
//            Set<String> windowHandles = ((PageObject)this).getWebDriver().getWindowHandles();
//            if (windowHandles != null && !StringUtil.nullAndEmptyCheck(((PageObject)this).getParameterValue())) {
//                for (String handle : windowHandles) {
//                    if(!((PageObject)this).getWebDriver().switchTo().window(handle).getTitle().equals(((PageObject)this).getParameterValue().toString())) {
//                        ((PageObject) this).getWebDriver().switchTo().window(((PageObject) this).getParameterValue().toString());
//                    }
//                    /*else if(!((PageObject)this).getWebDriver().switchTo().window(windowHandles.get(Integer.valueOf(((PageObject)this).getParameterValue().toString())));
//                    {
//                        ((PageObject)this).getWebDriver().switchTo().window(windowHandles.get(Integer.valueOf((PageObject)this).getParameterValue().toString()));
//                    }*/
//                }
//            }
//            else
//            {
//                ((PageObject)this).getWebDriver().switchTo().window(currentWindow);
//            }
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in window Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"getwindowByTitleName",e);
//        }
//    }
//
//    public void  getwindowByTabIndex() {
//        try {
//            log.info("Performing getwindowByTabIndex action");
//            String currentWindow = ((PageObject)this).getWebDriver().getWindowHandle();
//            ArrayList<String> windowHandles = new ArrayList(((PageObject)this).getWebDriver().getWindowHandles());
//            if (windowHandles != null && !StringUtil.nullAndEmptyCheck(((PageObject)this).getParameterValue())) {
//                for (String handle : windowHandles) {
//
//                    ((PageObject)this).getWebDriver().switchTo().window(windowHandles.get(Integer.valueOf(((PageObject)this).getParameterValue())));
//
//                }
//            }
//
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in window Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"getwindowByTabIndex",e);
//        }
//    }
//
//    public void pressKeyFromKeyboard()
//    {
//        log.info("Performing pressKeyFromKeyboard action");
//        Actions action = new Actions(BaseClass.driver.get());
//        try {
//            action.sendKeys(getKey()).build().perform();
//        }
//        catch (Exception e)
//        {
//            //Verify.logFailMessage("========Error in pressKeyFromKeyboard Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"pressKeyFromKeyboard",e);
//        }
//    }
//    public Keys getKey() {
//        if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("ok")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("enter")) {
//            return Keys.ENTER;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("refresh")) {
//            return Keys.BACK_SPACE;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("arrow_left")) {
//            return Keys.ARROW_LEFT;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("left")) {
//            return Keys.LEFT;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("up")) {
//            return Keys.UP;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("arrow_up")) {
//            return Keys.ARROW_UP;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("right")) {
//            return Keys.RIGHT;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("arrow_right")) {
//            return Keys.ARROW_RIGHT;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("down")) {
//            return Keys.DOWN;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("arrow_down")) {
//            return Keys.ARROW_DOWN;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("back")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("back_space")) {
//            return Keys.BACK_SPACE;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("home")) {
//            return Keys.HOME;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("menu")) {
//            return Keys.HOME; // MENU
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("return")) {
//            return Keys.RETURN;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("tab")) {
//            return Keys.TAB;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("page down")) {
//            return Keys.PAGE_DOWN;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("page up")) {
//            return Keys.PAGE_UP;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num0")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("0")) {
//            return Keys.NUMPAD0;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num1")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("1")) {
//            return Keys.NUMPAD1;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num2")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("2")) {
//            return Keys.NUMPAD2;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num3")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("3")) {
//            return Keys.NUMPAD3;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num4")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("4")) {
//            return Keys.NUMPAD4;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num5")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("5")) {
//            return Keys.NUMPAD5;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num6")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("6")) {
//            return Keys.NUMPAD6;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num7")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("7")) {
//            return Keys.NUMPAD7;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num8")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("8")) {
//            return Keys.NUMPAD8;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("num9")
//                || ((PageObject)this).getParameterValue().toString().toLowerCase().equals("9")) {
//            return Keys.NUMPAD9;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("cancel")) {
//            return Keys.CANCEL;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("clear")) {
//            return Keys.CLEAR;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("delete")) {
//            return Keys.DELETE;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("end")) {
//            return Keys.END;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("escape")) {
//            return Keys.ESCAPE;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f1")) {
//            return Keys.F1;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f2")) {
//            return Keys.F2;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f3")) {
//            return Keys.F3;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f4")) {
//            return Keys.F4;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f5")) {
//            return Keys.F5;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f6")) {
//            return Keys.F6;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f7")) {
//            return Keys.F7;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f8")) {
//            return Keys.F8;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f9")) {
//            return Keys.F9;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f10")) {
//            return Keys.F10;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f11")) {
//            return Keys.F11;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("f12")) {
//            return Keys.F12;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("help")) {
//            return Keys.HELP;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("insert")) {
//            return Keys.INSERT;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("pause")) {
//            return Keys.PAUSE;
//        } else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("space")) {
//            return Keys.SPACE;
//        }
//        else if (((PageObject)this).getParameterValue().toString().toLowerCase().equals("control"))
//        {
//            return Keys.CONTROL;
//        }
//        return null;
//    }
//
//
//
//    public WebDriver frame() {
//        try {
//            log.info("Performing frame action");
//            WebDriverWait wait = new WebDriverWait(((PageObject)this).getWebDriver(), ((PageObject)this).getTimeout());
//            wait.until(ExpectedConditions.visibilityOfAllElements(((PageObject)this).getElementList()));
//
//            List<WebElement> elements = ((PageObject)this).getWebDriver().findElements(By.tagName("iframe"));
//            int numberofTags = elements.size();
//            if (numberofTags != 0) {
//                return ((PageObject)this).getWebDriver().switchTo().frame(((PageObject)this).getParameterValue().toString());
//
//
//            }
//
//            return ((PageObject)this).getWebDriver().switchTo().defaultContent();
//
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in frame Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"frame",e);
//            return null;
//
//        }
//    }
//
//
//    public  void accept(WebDriver driver) {
//        try {
//            log.info("Performing accept action");
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in accept Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"accept",e);
//        }
//
//    }
//
//
//    public  void dismiss(WebDriver driver) {
//        try {
//            log.info("Performing dismiss action");
//            Alert alert = driver.switchTo().alert();
//            alert.dismiss();
//
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in dismiss Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"dismiss",e);
//        }
//    }
//
//
//
//    public  void enterIntoPromptBox(WebDriver driver,String value) {
//        try {
//            log.info("Performing enterIntoPromptBox action");
//            Alert alert = driver.switchTo().alert();
//            alert.sendKeys(value);
//            alert.accept();
//
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in enterIntoPromptBox Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"enterIntoPromptBox",e);
//        }
//    }
//
//
//
//    public static void takeScreenShotNormal() {
//        try {
//            log.info("Performing takeScreenShot action by normal method");
//            File src = ((TakesScreenshot) BaseClass.driver.get()).getScreenshotAs(OutputType.FILE);
//
//            BufferedImage originalImage = ImageIO.read(src);
//
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//
//            // originalImage= Scalr.resize(originalImage, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_EXACT, 740, 660);
//            ImageIO.write(originalImage, "png", baos);
//
//
//            StepDefinitions.scenario.get().embed(CompressJPEGFile.compressFile(originalImage), "image/png");
//
//        }
//        catch (WebDriverException e)
//        {
//            Constants.isFalseFailure = true;
//            Constants.falseFailureMessage = Constants.falseFailureMessage+" :"+e.getMessage().substring(0,40) +", need to check grid health!!!";
//            Verify.logFailMessage("Error While Taking Screen shot by normal method",e);
//        } catch (Exception e) {
//            Verify.logFailMessage("Error While Taking Screen shot by normal method",e);
//        }
//
//    }
//
//    public static void takeScreenShot() {
//        try {
//            log.info("Performing takeScreenShot action by Ashot Library");
//
//            Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.simple())
//                    .takeScreenshot(BaseClass.driver.get());
//
//            BufferedImage originalImage = fpScreenshot.getImage();
//
//            log.info("original Image Size: "+ ((long) originalImage.getData().getDataBuffer().getSize())*42);
//
//            StepDefinitions.scenario.get().embed(CompressJPEGFile.compressFile(originalImage), "image/png");
//
//       /* String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        FileUtils.copyFile(src, new File(Constants.PROJ_DIR()+File.separator+"screenshots" +File.separator+ " " + timestamp + ".png" ));*/
//        }
//        catch (WebDriverException e)
//        {
//            Constants.isFalseFailure = true;
//            Constants.falseFailureMessage = Constants.falseFailureMessage+" :"+e.getMessage().substring(0,40) +", need to check grid health!!!";
//            Verify.logFailMessage("Error While Taking Screen shot by normal method",e);
//        }
//        catch (Exception e)
//        {
//            log.error("Error While Taking Screen shot by Ashot Library",e);
//            takeScreenShotNormal();
//        }
//    }
//    public boolean elementInsideFrame() {
//        try {
//            log.info("Performing elementInsideFrame action");
//            boolean isInsideFrame = false;
//
//            if ( new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this))!= null) {
//
//                return true;
//            }
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in elementInsideFrame Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"elementInsideFrame",e);
//        }
//        return false;
//    }
//
//
//
//    public  boolean isTextPresentOnElement() {
//        log.info("Performing isTextPresentOnElement action");
//        new WebDriverExpectedConditions().explicitWaitDisplay(((PageObject)this));
//        if(((PageObject)this).getWebElement() != null&&!StringUtil.nullAndEmptyCheck(((PageObject)this).getParameterValue())) {
//            //Log.info("isTextPresentOnWebElement - text is null or empty");
//
//
//            try {
//                ((PageObject)this).setParameterValue(((PageObject)this).getParameterValue().toString().replace("\\\"", "\"").replace("\\n", "\n"));
//                String textContent = ((PageObject)this).getParameterValue().toString();
//                String pageSource = ((PageObject)this).getWebDriver().getPageSource().toLowerCase();
//                String pageTitle = getTitle().toLowerCase();
//                if (textContent.contains( ((PageObject)this).getParameterValue().toString())) {
//                    log.info("Body contains text " + ((PageObject)this).getParameterValue().toString());
//                    return true;
//                } else if (textContent.toLowerCase().contains( ((PageObject)this).getParameterValue().toString().toLowerCase())) {
//                    log.info("Body contains text " + ((PageObject)this).getParameterValue().toString());
//                    return true;
//                } else if (pageTitle != null && pageTitle.contains( ((PageObject)this).getParameterValue().toString().toLowerCase())) {
//                    log.info("Page title contains text " + ((PageObject)this).getParameterValue().toString());
//                    return true;
//                } else if (pageSource != null && pageSource.contains( ((PageObject)this).getParameterValue().toString().toLowerCase())) {
//                    log.info("Page source contains text " + ((PageObject)this).getParameterValue().toString());
//                    return true;
//                } else if (pageSource != null && pageSource.contains(StringEscapeUtils.escapeHtml( ((PageObject)this).getParameterValue().toString()).toLowerCase())) {
//                    log.info("Page source contains text " + StringEscapeUtils.escapeHtml(((PageObject)this).getParameterValue().toString()).toLowerCase());
//                    return true;
//                }
//            } catch (Exception e)
//            {
//                //   Verify.logFailMessage("========Error in isTextPresentOnElement Action on Page object :"+((PageObject) this).toString()+"" , e);
//                RetryLogic.retryLogic((PageObject) this,"isTextPresentOnElement",e);
//            }
//        }
//        return false;
//    }
//
//    public  boolean isSelected() {
//        try {
//            log.info("Performing isSelected action");
//            if (((PageObject)this).getWebElement().isSelected()) {
//                return true;
//            };
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in isSelected Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"isSelected",e);
//        }
//        return false;
//    }
//
//
//    public boolean waitUntilWebElementDisplayed() {
//        try {
//            log.info("Performing waitUntilWebElementDisplayed action");
//            WebDriverWait wait = new WebDriverWait(((PageObject) this).getWebDriver(), ((PageObject) this).getTimeout());
//            wait.until(ExpectedConditions.visibilityOf(((PageObject) this).getWebElement()));
//            return true;
//        }
//        catch (Exception e)
//        {
//            //   Verify.logFailMessage("========Error in waitUntillWebElementDisplayed Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"waitUntilWebElementDisplayed",e);
//            return false;
//        }
//
//    }
//
//    public void highlight() {
//
//        try {
//            log.info("Performing highlight action");
//            JavascriptExecutor jse = (JavascriptExecutor) ((PageObject)this).getWebDriver();
//            jse.executeScript("arguments[0].style.border='2px solid black'", ((PageObject)this).getWebElement());
//            log.info("HIGHLIGHT Action Performed");
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in highlight Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"highlight",e);
//        }
//    }
//
//
//
//
//    public  void scrollIntoView() {
//        try {
//            log.info("Performing scrollIntoView action");
//            JavascriptExecutor js=(JavascriptExecutor)((PageObject)this).getWebDriver();
//            js.executeScript("arguments[0].scrollIntoView(true);",((PageObject)this).getWebElement());
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in scrollIntoView Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"scrollIntoView",e);
//        }
//    }
//
//
//    public void scrollAndClick() {
//        try {
//            log.info("Performing scrollAndClick action");
//            JavascriptExecutor js=(JavascriptExecutor)((PageObject)this).getWebDriver();
//            js.executeScript("arguments[0].scrollIntoView(true);arguments[0].click();", ((PageObject)this).getWebElement());
//        } catch (Exception e) {
//            // Verify.logFailMessage("========Error in scrollAndClick Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"scrollAndClick",e);
//        }
//    }
//
//    public void refreshWindow()
//    {
//        try {
//            log.info("Performing refreshWindow action");
//            JavascriptExecutor js = (JavascriptExecutor) ((PageObject) this).getWebDriver();
//            js.executeScript("history.go(0);");
//        }
//        catch (Exception e)
//        {
//            // Verify.logFailMessage("========Error in refreshWindow Action on Page object :"+((PageObject) this).toString()+"" , e);
//
//            RetryLogic.retryLogic((PageObject) this,"refreshWindow",e);
//        }
//    }
//
//    public void scrollToElement(int xPixels,int yPixels)
//    {
//        try {
//            log.info("Performing scrollToElement action");
//            JavascriptExecutor js = (JavascriptExecutor) ((PageObject) this).getWebDriver();
//            js.executeScript("window.scrollBy(" + xPixels + "," + yPixels + ")");
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in scrollToElement Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"scrollToElement",e);
//        }
//    }
//    public void scrollDownToBottom()
//    {
//        try {
//            log.info("Performing scrollDownToBottom action");
//            JavascriptExecutor js = (JavascriptExecutor) ((PageObject) this).getWebDriver();
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        }
//        catch (Exception e)
//        {
//            //  Verify.logFailMessage("========Error in scrollDownToBottom Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"scrollDownToBottom",e);
//        }
//    }
//    public void datePicker(String Date)
//    {
//        try {
//            log.info("Performing datePicker action");
//            JavascriptExecutor js = (JavascriptExecutor) ((PageObject) this).getWebDriver();
//            js.executeScript("document.getElementById('" + ((PageObject) this).getWebElement() + "').setAttribute('value','" + Date + "')");
//        }
//        catch (Exception e)
//        {
//            //   Verify.logFailMessage("========Error in datePicker Action on Page object :"+((PageObject) this).toString()+"" , e);
//            RetryLogic.retryLogic((PageObject) this,"datePicker",e);
//        }
//    }
//
//    public void navigate()
//    {
//        try {
//
//            if (((PageObject) this).getParameterValue().equalsIgnoreCase("back")) {
//                ((PageObject) this).getWebDriver().navigate().back();
//            } else {
//                ((PageObject) this).getWebDriver().navigate().forward();
//            }
//        }
//        catch (Exception e)
//        {
//            RetryLogic.retryLogic((PageObject) this,"navigate",e);
//        }
//    }
//
//    public void remoteFileDownloads(WebDriver driver)
//    {
//        if(Constants.testDataMap.getStringValue(GRID).equalsIgnoreCase("yes")){
//            String username=Constants.GRIDUSERNAME;
//            String password=Constants.GRIDPASSWORD;
//            String[] hubHost=Constants.testDataMap.getStringValue(GRIDNODE).split("//",-1);
//            int index=hubHost[1].indexOf("4444");
//            String hub1=hubHost[1].substring(0,index);
//            String hubip= StringUtils.remove(hub1,":");
//            String hubport=hubHost[1].substring(index,index+4);
//            Host hub = new Host(hubip, hubport);
//            String url = String.format("%s:%d/wd/hub", hub.getIpAddress(), hub.getPort());
//            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
//            GridApiAssistant assistant = new GridApiAssistant(hub);
//            //Now lets query the Hub to figure out to which node did the hub route our test to.
//            Host node = assistant.getNodeDetailsForSession(sessionId);
//            //Lets check what does the node configuration look like.
//            NodeConfiguration nodeConfig = assistant.getNodeConfigForSession(node);
//            Calendar cal = Calendar.getInstance();
//            cal.add(Calendar.DATE, 1);
//            Date date = cal.getTime();
//            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
//            RemoteTransfer.downloadfromRemote(node.getIpAddress(), username, password, 22, overAllGridDownloadLocation, DownloadLocation);
//        }else {
//            StepDefinitions.scenario.get().write("Current run is local execution,hence DownloadLocation will be default one: " + DownloadLocation);
//            log.info("Current run is local execution,hence DownloadLocation will be default one: " + DownloadLocation);
//        }
//    }
//    public boolean waitUntilFileDownloaded(String... params) {
//        long timeOutinSec=Long.parseLong(params[0]);
//        String fileName=params[1];
//        if (timeOutinSec<0){
//            Verify.logFailMessage("waitUntilFileDownloaded - timeOut is negative");
//            return false;
//        }
//        if (fileName==null || fileName.isEmpty()){
//            Verify.logFailMessage("waitUntilFileDownloaded - fileName is null or empty");
//            return false;
//        }
//        try{
//            String filePathName = Constants.DownloadLocation+fileName;
//            Date date = new Date();
//            long startTime = date.getTime();
//            long endTime = date.getTime();
//            File file=null;
//            do{
//                file=FileUtil.checkFileExists(filePathName);
//                if (file!=null){
//                    long currentFileSize=0;
//                    int count=0;
//                    do{
//                        long fileSize=file.length();
//                        if (fileSize>0 && fileSize>currentFileSize){
//                            currentFileSize=fileSize;
//                            count=0;
//                        }else{
//                            if (fileSize>0 && fileSize==currentFileSize){
//                                if (count==5){
//                                    log.info("waitUntilFileDownloaded - File "+fileName+" completely downloaded in folder "+DownloadLocation);
//                                    return true;
//                                }
//                                count++;
//                            }
//                        }
//                        date = new Date();
//                        endTime = date.getTime();
//                    }while((endTime-startTime)<timeOutinSec*1000);
//                }
//                date = new Date();
//                endTime = date.getTime();
//            }while((endTime-startTime)<timeOutinSec*1000);
//            if(file!=null){
//                Verify.logFailMessage("Time out "+timeOutinSec+" seconds - File "+fileName+" is not completely downloaded in folder "+ DownloadLocation);
//            }else{
//                Verify.logFailMessage("Time out "+timeOutinSec+" seconds - File "+fileName+" does not exist in folder "+DownloadLocation);
//            }
//        }catch(Exception e){
//            Verify.logFailMessage("waitUntilFileDownloaded - Exception "+e.getLocalizedMessage());
//        }
//        return false;
//    }
//    public boolean saveClipboardContenttoVariable(String variable) {
//        if (variable==null || variable.isEmpty()){
//            Verify.logFailMessage("saveClipboardContentIntoVariable - variable is null or empty");
//            return false;
//        }
//        try {
//            Toolkit toolkit = Toolkit.getDefaultToolkit();
//            Clipboard clipboard = toolkit.getSystemClipboard();
//            String clipboardContent = (String) clipboard.getData(DataFlavor.stringFlavor);
//            clipBoardVariable.put(variable, clipboardContent);
//            return true;
//        } catch (Exception e) {
//            Verify.logFailMessage("saveClipboardContentIntoVariable - Exception "+e.getLocalizedMessage());
//        }
//        return false;
//    }
//    public boolean saveClipboardContenttoFile(String... params) {
//        String fileName=params[0];
//        String type=params[1];
//        if (fileName==null || fileName.isEmpty()){
//            Verify.logFailMessage("saveClipboardContentIntoFile - fileName is null or empty");
//            return false;
//        }
//        try {
//            String filePathName = MAIN_RESOURCES_DIR+File.separator+fileName;
//            if (filePathName!=null && !filePathName.isEmpty()){
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                Clipboard clipboard = toolkit.getSystemClipboard();
//                String clipboardContent = (String) clipboard.getData(DataFlavor.stringFlavor);
//                if (FilenameUtils.isExtension(filePathName,"txt")||FilenameUtils.isExtension(filePathName,"json")){
//                    File file=FileUtil.checkFileExists(filePathName);
//                    if (file!=null) {
//                        FileUtils.writeStringToFile(file, clipboardContent, "UTF_8",false);
//                        return true;
//                    }
//                }
//            }else{
//                Verify.logFailMessage("saveClipboardContentIntoFile - filePathName is null or empty");
//            }
//        } catch (Exception e) {
//            Verify.logFailMessage("saveClipboardContentIntoFile - Exception "+e.getLocalizedMessage());
//        }
//        return false;
//    }
//    public String readPdfAsString(String... params)
//    {
//        String filepath=params[0];
//        String password=params[1];
//
//        try {
//            PDDocument doc = PDDocument.load(new FileInputStream(filepath));
//            if(doc.isEncrypted())
//            {
//                return PdfUtil.encryptedPdfToString(filepath,password);
//            }
//            else{
//                return PdfUtil.pdfToString(filepath);
//            }
//        }
//        catch (IOException | SAXException | TikaException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * Check whether or not the element is displayed.
//     *
//     * @return True if the element is displayed, false otherwise
//     */
//    public boolean isDisplayed() {
//        boolean isDisplayed = false;
//        try {
//            log.info("Performing isDisplayed() action");
//            if (((PageObject)this).getWebElement().isDisplayed()) {
//                log.info("isDisplayed() action  performed successfully");
//                isDisplayed = true;
//            }
//        }
//        catch (Exception e) {
//            RetryLogic.retryLogic((PageObject) this,"isDisplayed",e);
//        }
//        return isDisplayed;
//    }
//
//    /**
//     * Get the visible innerText of this element, including sub-elements, without any leading or trailing whitespace.
//     *
//     * @return The innerText of this element.
//     */
//    public String getText() {
//        String value = null;
//        try {
//            log.info("Performing getText() action");
//            value = ((PageObject)this).getWebElement().getText();
//            log.info("getText() retrieved value : "+ value);
//        }
//        catch (Exception e) {
//            RetryLogic.retryLogic((PageObject) this,"getText",e);
//        }
//        return value;
//    }
//
//    /**
//     *  This method will return the value of the property with the given name, if it exists.
//     *  If it does not, then the value of the attribute with the given name is returned. If neither exists, null is returned.
//     *
//     * @param attrName the name of the attribute.
//     * @return The attribute/property's current value or null if the value is not set.
//     */
//    public String getAttribute(String attrName) {
//        String attrValue = null;
//        try {
//            log.info("Performing getAttribute() action");
//            attrValue = ((PageObject)this).getWebElement().getAttribute(attrName);
//            log.info("getAttribute() retrieved value : "+ attrValue);
//        }
//        catch (Exception e) {
//            RetryLogic.retryLogic((PageObject) this,"getAttribute",e);
//        }
//        return attrValue;
//    }
//
//    /**
//     * Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
//     *
//     * @return True if the element is enabled, false otherwise
//     */
//    public boolean isEnabled() {
//        boolean isEnabled = false;
//        try {
//            log.info("Performing isEnabled() action");
//            if (((PageObject)this).getWebElement().isEnabled()) {
//                log.info("isEnabled() action performed successfully");
//                isEnabled = true;
//            }
//        }
//        catch (Exception e) {
//            RetryLogic.retryLogic((PageObject) this,"isEnabled",e);
//        }
//        return isEnabled;
//    }
//}
