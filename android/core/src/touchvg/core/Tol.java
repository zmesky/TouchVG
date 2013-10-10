/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.core;

public class Tol {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Tol(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Tol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Tol(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Tol gTol() {
    return new Tol(touchvgJNI.Tol_gTol(), false);
  }

  public static Tol minTol() {
    return new Tol(touchvgJNI.Tol_minTol(), false);
  }

  public Tol() {
    this(touchvgJNI.new_Tol__SWIG_0(), true);
  }

  public Tol(float tolPoint, float tolVector) {
    this(touchvgJNI.new_Tol__SWIG_1(tolPoint, tolVector), true);
  }

  public Tol(float tolPoint) {
    this(touchvgJNI.new_Tol__SWIG_2(tolPoint), true);
  }

  public float equalPoint() {
    return touchvgJNI.Tol_equalPoint(swigCPtr, this);
  }

  public float equalVector() {
    return touchvgJNI.Tol_equalVector(swigCPtr, this);
  }

  public void setEqualPoint(float tol) {
    touchvgJNI.Tol_setEqualPoint(swigCPtr, this, tol);
  }

  public void setEqualVector(float tol) {
    touchvgJNI.Tol_setEqualVector(swigCPtr, this, tol);
  }

}