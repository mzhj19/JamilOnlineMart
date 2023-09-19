import { TestBed } from '@angular/core/testing';

import { JamilMartFormService } from './jamil-mart-form.service';

describe('JamilMartFormService', () => {
  let service: JamilMartFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JamilMartFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
