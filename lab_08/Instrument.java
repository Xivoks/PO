package com.company;

import java.time.LocalDate;

    public abstract class Instrument {
        public Instrument(String producent, LocalDate rokProdukcji)
        {
            this.producent = producent;
            this.rokProdukcji=rokProdukcji;
        }
        public String getProducent(){
            return this.producent;
        }
        public LocalDate getRokProdukcji(){
            return  this.rokProdukcji;
        }
        public abstract String dzwiek();

        public boolean equals(Object obj) {
            return this.toString().equals(obj.toString());
        }

        public String toString() {
            return this.getClass().getSimpleName()+", producent: "+this.producent+", data produkcji: "+this.rokProdukcji;
        }

        private String producent;
        private LocalDate rokProdukcji;
}
