import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NumData } from 'src/app/common/num-data';
import { NumDataService } from 'src/app/services/num-data.service';

@Component({
  selector: 'app-num-data',
  templateUrl: './num-data.component.html',
  styleUrls: ['./num-data.component.css']
})
export class NumDataComponent implements OnInit {

  numData: NumData[];

  constructor(private numDataService: NumDataService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.phoneData();
    });
  } 

  phoneData(){
      this.numDataService.get().subscribe(
        data => {
          this.numData = data;
        }
      )
    }
}
