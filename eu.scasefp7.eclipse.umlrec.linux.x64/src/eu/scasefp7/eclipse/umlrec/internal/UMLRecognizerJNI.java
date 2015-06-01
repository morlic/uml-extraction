/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package eu.scasefp7.eclipse.umlrec.internal;

import java.util.ArrayList;

import eu.scasefp7.eclipse.umlrec.MissingRecognizerNativeException;
public class UMLRecognizerJNI {

    static {
	    try {
	    	ArrayList<String> list = new ArrayList<String>();
	    	
	    	list.add("lept"); //$NON-NLS-1$
	    	list.add("tesseract"); //$NON-NLS-1$
	    	list.add("opencv_core"); //$NON-NLS-1$
	    	list.add("opencv_highgui"); //$NON-NLS-1$
	    	list.add("opencv_imgproc"); //$NON-NLS-1$
	  
	    	list.add("UMLrecogn"); //$NON-NLS-1$

	    	System.out.println("UMLRecognizer JNI (Linux/x64) starting");

	    	/**
	    	 * Iterate through the list of libraries and remove all libraries from the list
	    	 * that could be loaded. Repeat this step until all libraries are loaded.
	    	 * The Reason: You can only load a library, if all dependent libraries have
	    	 * already been loaded. So you need to know the correct ordering from the
	    	 * leafs to the root. Load the leafs first!
	    	 */
	    	ArrayList<String> toRemove;
	    	int i = 10; //cancel after 10 iterations. You probably forgot to mention a library to load.
	    	while (!list.isEmpty() && (i > 0)) {
	    		toRemove = new ArrayList<String>();
	    		int j = 0;
	    		while (j <= list.size() - 1) {
	    			try {
	    				System.loadLibrary(list.get(j));
	    				toRemove.add(list.get(j));
	    				System.out.println("loaded library " + j + ": " + list.get(j)); //$NON-NLS-1$
	    			} catch (Throwable e) {
	    				System.out.println(e.getMessage());
	    				System.out.println("error loading lib: " + list.get(j)); //$NON-NLS-1$
	    			}
	    			j++;
	    		}
	    		for (String lib : toRemove) {
	    			System.out.println("removing lib : " + lib); //$NON-NLS-1$
	    			list.remove(lib);
	    		}
	    		i--;
	    	}
	    } catch (UnsatisfiedLinkError e) {
	      System.err.println("Native code library failed to load. \n" + e); //$NON-NLS-1$
	      throw new MissingRecognizerNativeException("Native code library failed to load", e);
	    }
    }

	public final static native long new_StringList__SWIG_0();
	public final static native long new_StringList__SWIG_1(long jarg1);
	public final static native long new_StringList__SWIG_2(long jarg1, StringList jarg1_);
	public final static native long StringList_capacity(long jarg1, StringList jarg1_);
	public final static native void StringList_reserve(long jarg1, StringList jarg1_, long jarg2);
	public final static native boolean StringList_isEmpty(long jarg1, StringList jarg1_);
	public final static native void StringList_clear(long jarg1, StringList jarg1_);
	public final static native void StringList_push_back(long jarg1, StringList jarg1_, String jarg2);
	public final static native String StringList_get(long jarg1, StringList jarg1_, int jarg2);
	public final static native String StringList_set(long jarg1, StringList jarg1_, int jarg2, String jarg3);
	public final static native int StringList_size(long jarg1, StringList jarg1_);
	public final static native void StringList_removeRange(long jarg1, StringList jarg1_, int jarg2, int jarg3);
	public final static native void delete_StringList(long jarg1);
	public final static native long new_UMLrecog();
	public final static native void delete_UMLrecog(long jarg1);
	public final static native void UMLrecog_clear(long jarg1, UMLrecog jarg1_);
	public final static native void UMLrecog_setParameters__SWIG_0(long jarg1, UMLrecog jarg1_, boolean jarg2, boolean jarg3, int jarg4, double jarg5, double jarg6, double jarg7);
	public final static native void UMLrecog_setParameters__SWIG_1(long jarg1, UMLrecog jarg1_, boolean jarg2, boolean jarg3, int jarg4, double jarg5, double jarg6);
	public final static native void UMLrecog_setParameters__SWIG_2(long jarg1, UMLrecog jarg1_, boolean jarg2, boolean jarg3, int jarg4, double jarg5);
	public final static native void UMLrecog_setParameters__SWIG_3(long jarg1, UMLrecog jarg1_, boolean jarg2, boolean jarg3, int jarg4);
	public final static native void UMLrecog_setParameters__SWIG_4(long jarg1, UMLrecog jarg1_, boolean jarg2, boolean jarg3);
	public final static native void UMLrecog_setParameters__SWIG_5(long jarg1, UMLrecog jarg1_, boolean jarg2);
	public final static native void UMLrecog_setParameters__SWIG_6(long jarg1, UMLrecog jarg1_);
	public final static native boolean UMLrecog_setImage(long jarg1, UMLrecog jarg1_, String jarg2);
	public final static native void UMLrecog_setTessPath(long jarg1, UMLrecog jarg1_, String jarg2);
	public final static native int UMLrecog_process(long jarg1, UMLrecog jarg1_);
	public final static native long UMLrecog_getXMIcontent(long jarg1, UMLrecog jarg1_);
}
