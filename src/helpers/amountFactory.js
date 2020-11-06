import Unit from './unit';
import Special from './special';
 
const amountFactory = rules => {
  return rules = rules.map( x => {
    if(typeof x.special != 'undefined') {
      return new Special(x.item, x.price, x.special.quantity, x.special.specialPrice);
    }

    return new Unit(x.item, x.price); 
  })
}

export default amountFactory;