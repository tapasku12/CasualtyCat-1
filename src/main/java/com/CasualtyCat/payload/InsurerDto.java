package com.CasualtyCat.payload;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InsurerDto {

    private String id;
    @NotEmpty
    @Size(min = 1,message = "enter valid name")
    private String companyName;
    private String address;
    private String companyLogo;
    @Digits(integer = 10, fraction = 0, message = "mobile must be a 10-digit number")
    private long contactNumber;
    private Date linkExpiryDate;
    private  String durationOfSubscription;
    private int noOfAgents;
    private String paymentMode;
    private int noOfTokens;


}
