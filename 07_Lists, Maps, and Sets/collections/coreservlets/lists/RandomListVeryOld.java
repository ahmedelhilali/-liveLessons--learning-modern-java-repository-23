package coreservlets.lists;

import java.util.*;

/** The third of three examples of the use of Lists. This
 *  version uses the now-obsolete syntax from Java 1.4 and earlier,
 *  withOUT giving the list element type. This is given for comparison only;
 *  modern programs should NOT use unparameterized Lists.
 *  <p>
 *  The funny @SuppressWarnings annotation below is to tell Eclipse not to
 *  warn me that I am "forgetting" to use parameterized types,
 *  since I am making this example specifically to illustrate that point.
 *  Sadly, however, Eclipse does not have a token specific to that warning, so I am 
 *  somewhat dangerously suppressing all warnings. @SuppressWarnings("rawtypes") will
 *  suppress some, but not all, warnings in the code below.
 *  Still, this is better than getting in the habit
 *  of leaving warnings in code, and thus getting in the habit of ignoring them.
 *  For details on suppressing warnings, see
 *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

@SuppressWarnings("all")
public class RandomListVeryOld {
  public static void main(String[] args) {
    List entries = new ArrayList();
    double d;
    while((d = Math.random()) > 0.1) {
      entries.add("Value: " + d);
    }
    String entry;
    for(int i=0; i<entries.size(); i++) {
      entry = (String)entries.get(i);
      System.out.println(entry);
    }
  }
}