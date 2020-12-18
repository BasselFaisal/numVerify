import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NumData } from 'src/app/common/num-data';
import { NumDataService } from 'src/app/services/num-data.service';

@Component({
  selector: 'app-verify-number',
  templateUrl: './verify-number.component.html',
  styleUrls: ['./verify-number.component.css']
})
export class VerifyNumberComponent implements OnInit {

  numData: NumData;
  submitted = false;

  constructor(private numDataService: NumDataService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {

  }

  listProducts(phone: number) {
    this.verifyNumber(phone);
  }
  verifyNumber(phone: number): void {

    this.numDataService.getNumber(phone)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
          this.numData = response;
        },
        error => {
          console.log(error);
        });
  }

  newNumber(): void {
    this.submitted = false;
  }
}
