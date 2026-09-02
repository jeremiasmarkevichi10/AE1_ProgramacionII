    package org.example;
    import java.util.List;
    import java.util.ArrayList;

    public class Factura {
        private int numero;
        private String fecha;
        private Cliente cliente;
        private Empleado empleado;
        private List<ItemComercial> itemsComprados;
        private FormaPago formapago;
        private Pago pago;

        public Factura(int numero, String fecha, Cliente cliente,
                       Empleado empleado, List<ItemComercial> itemsFactura, FormaPago formapago, Pago pago){
            this.numero = numero;
            this.fecha = fecha;
            this.cliente = cliente;
            this.formapago = formapago;
            this.empleado = empleado;
            this.pago = pago;
            this.itemsComprados = itemsFactura;
        }

        public int getNumero() {
            return numero;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public String getFecha() {
            return fecha;
        }

        public Empleado getEmpleado() {
            return empleado;
        }

        public List<ItemComercial> getItemsComprados() {
            return itemsComprados;
        }

        public FormaPago getFormapago() {
            return formapago;
        }

        public Pago getPago() {
            return pago;
        }

    }
