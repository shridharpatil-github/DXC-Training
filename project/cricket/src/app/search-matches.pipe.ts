import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchMatches'
})
export class SearchMatchesPipe implements PipeTransform {

  transform(matches: any[], search: string): any {
    if (!matches) {
      return null;
    }
    if (!search) {
      return matches;
    }
    return matches.filter( function(match) {
      return JSON.stringify(match).toLowerCase().includes(search.toLowerCase());
    });
  }

}
