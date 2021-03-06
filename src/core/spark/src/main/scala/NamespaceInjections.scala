// Copyright (C) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See LICENSE in project root for information.

package org.apache.spark.ml

import org.apache.spark.ml.util.Identifiable

object NamespaceInjections {

  def pipelineModel(stages: Array[Transformer]): PipelineModel = {
    new PipelineModel(Identifiable.randomUID("PipelineModel"), stages)
  }

}
