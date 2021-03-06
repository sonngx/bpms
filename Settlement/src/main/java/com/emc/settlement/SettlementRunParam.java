package com.emc.settlement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SettlementRunParam implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String runForm;
   private java.lang.String runType;
   private java.util.Date settlementDate;
   private java.util.Date toSettlementDate;

   private java.lang.String runEveId;

   private java.lang.String runId;

   public SettlementRunParam()
   {
   }

   public java.lang.String getRunForm()
   {
      return this.runForm;
   }

   public void setRunForm(java.lang.String runForm)
   {
      this.runForm = runForm;
   }

   public java.lang.String getRunType()
   {
      return this.runType;
   }

   public void setRunType(java.lang.String runType)
   {
      this.runType = runType;
   }

   public java.util.Date getSettlementDate()
   {
      return this.settlementDate;
   }

   public void setSettlementDate(java.util.Date settlementDate)
   {
      this.settlementDate = settlementDate;
   }

   public java.util.Date getToSettlementDate()
   {
      return this.toSettlementDate;
   }

   public void setToSettlementDate(java.util.Date toSettlementDate)
   {
      this.toSettlementDate = toSettlementDate;
   }

   public java.lang.String getRunEveId()
   {
      return this.runEveId;
   }

   public void setRunEveId(java.lang.String runEveId)
   {
      this.runEveId = runEveId;
   }

   public java.lang.String getRunId()
   {
      return this.runId;
   }

   public void setRunId(java.lang.String runId)
   {
      this.runId = runId;
   }

   public SettlementRunParam(java.lang.String runForm, java.lang.String runType,
         java.util.Date settlementDate, java.util.Date toSettlementDate,
         java.lang.String runEveId, java.lang.String runId)
   {
      this.runForm = runForm;
      this.runType = runType;
      this.settlementDate = settlementDate;
      this.toSettlementDate = toSettlementDate;
      this.runEveId = runEveId;
      this.runId = runId;
   }

}