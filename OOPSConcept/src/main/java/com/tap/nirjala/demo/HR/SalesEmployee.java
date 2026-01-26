package com.tap.nirjala.demo.HR;

import com.tap.nirjala.demo.HR.Interfaces.IBonusEligible;

public class SalesEmployee extends Employee  implements IBonusEligible {
        protected double incentive;
        protected double target;
        protected double acheivedTarget;
        protected double basicSalary;
        protected double hra;

        public SalesEmployee(int id,String firstName,String lastName,String email,String contactNumber,String location,double incentive,double target,double acheivedTarget,double basicSalary,double hra){
            super(id, firstName, lastName, email, contactNumber, location);

            this.incentive=incentive;
            this.target=target;
            this.acheivedTarget=acheivedTarget;
            this.basicSalary=basicSalary;
            this.hra=hra;
        }

        @Override
        public void doWork(){
            System.out.println(firstName+"is selling products and meeting clients");
        }
        
        @Override
        public double computePay(){
            double totalSalary=basicSalary+hra;
            if(acheivedTarget>=target){
                totalSalary+=incentive;
            }
            return totalSalary;
        }
        @Override
        public float CalculateBonus()
        {
            System.out.println("employee bonus");
            return 5000f;
        }

    }

