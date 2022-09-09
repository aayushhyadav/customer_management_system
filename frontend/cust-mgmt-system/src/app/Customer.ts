export class Customer {
    constructor(
        public customerId: number,
        public customerName: string,
        public email: string,
        public accType: string,
        public password: string,
    ) {
        
    }
}