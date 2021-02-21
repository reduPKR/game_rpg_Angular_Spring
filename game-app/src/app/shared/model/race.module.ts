import { SkillPoints } from "./skill-points.model";

export class Race { 
  id: number = 0;
  name: string = "";
  description: string = "";
  skill_points: SkillPoints | undefined;
}
