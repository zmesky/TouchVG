/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiCoreViewData extends MgView {
  private long swigCPtr;

  protected GiCoreViewData(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.GiCoreViewData_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiCoreViewData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiCoreViewData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setDrawing(GiPlaying value) {
    touchvgJNI.GiCoreViewData_drawing_set(swigCPtr, this, GiPlaying.getCPtr(value), value);
  }

  public GiPlaying getDrawing() {
    long cPtr = touchvgJNI.GiCoreViewData_drawing_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GiPlaying(cPtr, false);
  }

  public void setBackDoc(MgShapeDoc value) {
    touchvgJNI.GiCoreViewData_backDoc_set(swigCPtr, this, MgShapeDoc.getCPtr(value), value);
  }

  public MgShapeDoc getBackDoc() {
    long cPtr = touchvgJNI.GiCoreViewData_backDoc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public void setPlay(GiPlayShapes value) {
    touchvgJNI.GiCoreViewData_play_set(swigCPtr, this, GiPlayShapes.getCPtr(value), value);
  }

  public GiPlayShapes getPlay() {
    long cPtr = touchvgJNI.GiCoreViewData_play_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GiPlayShapes(cPtr, false);
  }

  public void submitBackXform() {
    touchvgJNI.GiCoreViewData_submitBackXform(swigCPtr, this);
  }

  public static GiCoreViewData fromHandle(int h) {
    long cPtr = touchvgJNI.GiCoreViewData_fromHandle(h);
    return (cPtr == 0) ? null : new GiCoreViewData(cPtr, false);
  }

  public MgRecordShapes recorder(boolean forUndo) {
    long cPtr = touchvgJNI.GiCoreViewData_recorder(swigCPtr, this, forUndo);
    return (cPtr == 0) ? null : new MgRecordShapes(cPtr, false);
  }

  public void setRecorder(boolean forUndo, MgRecordShapes p) {
    touchvgJNI.GiCoreViewData_setRecorder(swigCPtr, this, forUndo, MgRecordShapes.getCPtr(p), p);
  }

  public int getPlayingCount() {
    return touchvgJNI.GiCoreViewData_getPlayingCount(swigCPtr, this);
  }

  public int acquireFrontDoc(int index) {
    return touchvgJNI.GiCoreViewData_acquireFrontDoc(swigCPtr, this, index);
  }

  public int acquireFrontShapes(int index) {
    return touchvgJNI.GiCoreViewData_acquireFrontShapes(swigCPtr, this, index);
  }

  public void addPlaying(GiPlaying p) {
    touchvgJNI.GiCoreViewData_addPlaying(swigCPtr, this, GiPlaying.getCPtr(p), p);
  }

  public void removePlaying(GiPlaying p) {
    touchvgJNI.GiCoreViewData_removePlaying(swigCPtr, this, GiPlaying.getCPtr(p), p);
  }

}
