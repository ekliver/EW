package sys.agregar;
// Generated 29-abr-2017 17:18:09 by Hibernate Tools 4.3.1



/**
 * AimarNivel2Id generated by hbm2java
 */
public class AimarNivel2Id  implements java.io.Serializable {


     private String rucCompanyia;
     private String codNiv1;
     private String codNiv2;

    public AimarNivel2Id() {
    }

    public AimarNivel2Id(String rucCompanyia, String codNiv1, String codNiv2) {
       this.rucCompanyia = rucCompanyia;
       this.codNiv1 = codNiv1;
       this.codNiv2 = codNiv2;
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
    public String getCodNiv2() {
        return this.codNiv2;
    }
    
    public void setCodNiv2(String codNiv2) {
        this.codNiv2 = codNiv2;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AimarNivel2Id) ) return false;
		 AimarNivel2Id castOther = ( AimarNivel2Id ) other; 
         
		 return ( (this.getRucCompanyia()==castOther.getRucCompanyia()) || ( this.getRucCompanyia()!=null && castOther.getRucCompanyia()!=null && this.getRucCompanyia().equals(castOther.getRucCompanyia()) ) )
 && ( (this.getCodNiv1()==castOther.getCodNiv1()) || ( this.getCodNiv1()!=null && castOther.getCodNiv1()!=null && this.getCodNiv1().equals(castOther.getCodNiv1()) ) )
 && ( (this.getCodNiv2()==castOther.getCodNiv2()) || ( this.getCodNiv2()!=null && castOther.getCodNiv2()!=null && this.getCodNiv2().equals(castOther.getCodNiv2()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRucCompanyia() == null ? 0 : this.getRucCompanyia().hashCode() );
         result = 37 * result + ( getCodNiv1() == null ? 0 : this.getCodNiv1().hashCode() );
         result = 37 * result + ( getCodNiv2() == null ? 0 : this.getCodNiv2().hashCode() );
         return result;
   }   


}

