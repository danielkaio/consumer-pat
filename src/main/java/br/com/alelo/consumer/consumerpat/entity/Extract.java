        package br.com.alelo.consumer.consumerpat.entity;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import java.util.Date;

        @Data
        @Entity
        @NoArgsConstructor
        public class Extract {

            @Id
            int id;
            int establishmentNameId;
            String establishmentName;
            String productDescription;
            Date dateBuy;
            int cardNumber;
            double value;


            public Extract(String establishmentName, String productDescription, Date dateBuy, int cardNumber, double value) {
                this.id = id;
                this.establishmentNameId = establishmentNameId;
                this.establishmentName = establishmentName;
                this.productDescription = productDescription;
                this.dateBuy = dateBuy;
                this.cardNumber = cardNumber;
                this.value = value;
            }


        }
