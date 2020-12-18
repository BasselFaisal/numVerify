import { TestBed } from '@angular/core/testing';

import { NumDataService } from './num-data.service';

describe('NumDataService', () => {
  let service: NumDataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumDataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
