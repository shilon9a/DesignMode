package Chain;

import Chain.Abstract.AbstractLogger;
import Chain.Abstract.impl.logDebug;
import Chain.Abstract.impl.logInfo;

public class Main {
    public static void main(String[] args) {
        AbstractLogger logInfo=new logInfo();
        logInfo.logMsg("hello world");
    }
}
