/*
 */
package log;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class Log
{
    private static final boolean enable_log = true;
    private static final boolean debug = true && enable_log ;
    private static final boolean error = true && enable_log;
    private static final boolean information = true && enable_log;

    public static void logd(String msg)
    {
        if (debug)
        {
            System.out.println("D: "+getCallerInfo()+" msg: "+msg);
        }
    }

    public static void loge(String msg)
    {
        if (error)
        {
            System.out.println("E: "+getCallerInfo()+" msg: "+msg);
        }
    }

    public static void logi(String msg)
    {
        if (information)
        {
            System.out.println("I: "+getCallerInfo()+" msg: "+msg);
        }
    }
    
    private  static String getCallerInfo() {

      String callerInfo = "DefaultName-callerUnknown";
      // use class name instead of filename since filename is null for Sun/Java
      // classes when running in a JRE-only context
      String thisClassName = "log.Log";
      Thread thread = Thread.currentThread();
      StackTraceElement[] framesArray = thread.getStackTrace();

      // look for the last stack frame from this class and then whatever is next
      // is the caller we want to know about
      for (StackTraceElement stackFrame : framesArray) {

         // filter out Thread because we just created a couple frames using
         // Thread
         if (!stackFrame.getClassName().equals("java.lang.Thread")
             && !stackFrame.getClassName().equals(thisClassName)) {

            // handle case for file name when debug info is missing from
            // classfile
            String fileName = stackFrame.getFileName() != null ? stackFrame.getFileName()
                                                              : "Unknown";
            StringBuilder sb = new StringBuilder(stackFrame.getMethodName());
            sb.append('(');
            sb.append(fileName);
            sb.append(':');
            // if no debug info, returns a negative number
            sb.append(stackFrame.getLineNumber());
            sb.append(')');
            callerInfo = sb.toString();
            break;
         }
      }
      return callerInfo;
   }
}
