package sys.agregar;
// Generated 29-abr-2017 17:18:09 by Hibernate Tools 4.3.1



/**
 * AimarNivel1Id generated by hbm2java
 */
public class AimarNivel1Id  implements java.io.Serializable {


     private String rucCompanyia;
     private String codNiv1;

    public AimarNivel1Id() {
    }

    public AimarNivel1Id(String rucCompanyia, String codNiv1) {
       this.rucCompanyia = rucCompanyia;
       this.codNiv1 = codNiv1;
    }
   
    public String getRucCompanyia() {
        return this.rucCompanyia;
    }
    
    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }
    public String getCodNiv1() {
        return this.codNiv1;
    }
    
    public void setCodNiv1(String codNiv1) {
        this.codNiv1 = codNiv1;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AimarNivel1Id) ) return false;
		 AimarNivel1Id castOther = ( AimarNivel1Id ) other; 
         
		 return ( (this.getRucCompanyia()==castOther.getRucCompanyia()) || ( this.getRucCompanyia()!=null && castOther.getRucCompanyia()!=null && this.getRucCompanyia().equals(castOther.getRucCompanyia()) ) )
 && ( (this.getCodNiv1()==castOther.getCodNiv1()) || ( this.getCodNiv1()!=null && castOther.getCodNiv1()!=null && this.getCodNiv1().equals(castOther.getCodNiv1()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRucCompanyia() == null ? 0 : this.getRucCompanyia().hashCode() );
         result = 37 * result + ( getCodNiv1() == null ? 0 : this.getCodNiv1().hashCode() );
         return result;
   }   


}


